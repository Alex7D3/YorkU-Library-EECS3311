package com.yorku.library.restservice.controllers;

import java.sql.Date;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yorku.library.restservice.models.Course;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.models.Ownership;
import com.yorku.library.restservice.models.Request;
import com.yorku.library.restservice.models.Role;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.models.UserItem;
import com.yorku.library.restservice.repositories.CourseRepo;
import com.yorku.library.restservice.repositories.ItemRepo;
import com.yorku.library.restservice.repositories.RequestRepo;
import com.yorku.library.restservice.repositories.UserItemRepo;
import com.yorku.library.restservice.repositories.UserRepo;

@RestController
public class UserController {

	@Autowired
    private UserRepo userRepo;
	@Autowired
	private CourseRepo courseRepo;
	@Autowired
	private RequestRepo requestRepo;
	@Autowired
	private ItemRepo itemRepo;
	@Autowired
	private UserItemRepo uiRepo;
	
	
	@GetMapping("/user/login/{email}/{pw}")
	public ResponseEntity<User> userLogin(@PathVariable("email") String email, @PathVariable("pw") String pw) throws Exception{
		User user = userRepo.findByEmail(email).get();
		if (user.getPassword().equals(pw)) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		else {
			throw new Exception("Incorrect Password");
		}
	}
	
	
	@GetMapping("/user/logout")
	public void userLogout() {
		
	}
	
	@PostMapping("/user/register/{username}/{email}/{pw}/{role}")
	public ResponseEntity<User> userRegister(@PathVariable("username") String username, @PathVariable("email") String email, @PathVariable("pw") String pw, @PathVariable("role") String role)  throws Exception {
		Role role1 = Role.valueOf(role);
		System.out.println(role1);
		
		User user = new User(username, pw, email, role1);
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/user/{id}/items")
	public ResponseEntity<List<Item>> getUserItems(@PathVariable("id") Integer id) throws Exception{
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			List<Item> itemlist = new ArrayList<>();
			user.get().getItems().forEach(useritem -> itemlist.add(useritem.getItem()));
			return new ResponseEntity<List<Item>>(itemlist, HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist");
		}
	}
	
	@GetMapping("/user/{id}/courses")
	public ResponseEntity<List<Course>> getUserCourses(@PathVariable("id") Integer id) throws Exception{
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			List<Course> courselist = new ArrayList<>();
			courselist.addAll(user.get().getCourses());
			return new ResponseEntity<List<Course>>(courselist, HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist");
		}
	}
	
	@GetMapping("/user/{id}/overdueitems")
	public ResponseEntity<List<Item>> getOverdueItems(@PathVariable("id") Integer id) throws Exception{
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent() && user.get().getItems().size() > 0) {
			GregorianCalendar dateDue = new GregorianCalendar();
			dateDue.add(Calendar.MONTH, 1);
			List<UserItem> list1 = user.get().getItems().stream().filter(i -> i.getTimestamp() != null).toList();
			list1 = list1.stream().filter(i -> i.getTimestamp().toInstant().isAfter(dateDue.toInstant())).toList();
			List<Item> itemlist = new ArrayList<>();
			list1.forEach(u -> itemlist.add(u.getItem()));
			return new ResponseEntity<List<Item>>(itemlist, HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist or Doesnt Own Any Items");
		}
		
	}
	
	@GetMapping("/user/{id}/addcourse/{code}")
	public ResponseEntity<Course> addCourse(@PathVariable("code") String code, @PathVariable("id") Integer id) throws Exception{
		Optional<User> user1 = userRepo.findById(id);
		if (courseRepo.findByCourseCode(code).size() > 0 && user1.isPresent()) {
			Course course = courseRepo.findByCourseCode(code).get(0);
			course.addUser(user1.get());
			userRepo.save(user1.get());
			courseRepo.save(course);
			return new ResponseEntity<Course>(course, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Course or User Doesnt Exist");
		}
	}
	
	@GetMapping("/user/{id}/dropcourse/{code}")
	public ResponseEntity<Course> removeCourse(@PathVariable("code") String code, @PathVariable("id") Integer id) throws Exception {
		Optional<User> user1 = userRepo.findById(id);
		if (user1.isPresent() && courseRepo.findByCourseCode(code).size() > 0) {
			Course course = courseRepo.findByCourseCode(code).get(0);
			if (user1.get().getCourses().contains(course)) {
				course.removeUser(user1.get().getId());
				courseRepo.save(course);
				userRepo.save(user1.get());
				return new ResponseEntity<Course>(course, HttpStatus.OK);
			}
			else {
				throw new Exception("User Not Enrolled");
			}
		}
		else {
			throw new Exception("User or Course Doesnt Exist");
		}
		
	}
	
	@GetMapping("/user/{userid}/request/{itemid}/{priority}")
	public ResponseEntity<Request> requestItem(@PathVariable("itemid") Integer itemid, @PathVariable("priority") Integer priority, @PathVariable("userid") Integer userid) throws Exception{
		Optional<User> user1 = userRepo.findById(userid);
		Optional<Item> item = itemRepo.findById(itemid);
		if (item.isPresent() && user1.isPresent()) {
			Request req = new Request(priority, user1.get(), item.get());
			if (item.get().getRequest() != null) {
				throw new Exception("Request for Item Already Exists");
			}
			requestRepo.save(req);
			user1.get().addRequest(req);
			item.get().setRequest(req);
			itemRepo.save(item.get());
			userRepo.save(user1.get());
			return new ResponseEntity<Request>(req, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Item or User Doesnt Exist");
		}
	}
	
	@GetMapping("/user/{id}/notifs")
	public ResponseEntity<List<String>> userNotifs(@PathVariable("id") Integer id) {
		Optional<User> user = userRepo.findById(id);
		List<String> notis = new ArrayList<>();
		GregorianCalendar dateDue = new GregorianCalendar();
		dateDue.add(Calendar.DATE, 30);
		for (UserItem u : user.get().getItems()) {
			if (u.getTimestamp() != null) {
				if (u.getTimestamp().toInstant().isAfter(dateDue.toInstant())) {
					notis.add("One of your items (" + u.getItem().getTitle() + ") are overdue/nearing its due date");
				}
			}
		}
		return new ResponseEntity<List<String>>(notis, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{userid}/item/add/{relation}/{itemid}")
	public ResponseEntity<Item> addItemToUser(@PathVariable("relation") String relation, @PathVariable("itemid") Integer itemid, @PathVariable("userid") Integer userid) throws Exception{
		Optional<Item> item = itemRepo.findById(itemid);
		Optional<User> user1 = userRepo.findById(userid);
		GregorianCalendar dateDue = new GregorianCalendar();
		Date dateToday = new Date(dateDue.getTimeInMillis());
		dateDue.add(Calendar.MONTH, 1);
		int count = 0;
		
		if (user1.get().getItems().size() >= 10) {
			throw new Exception("User Has Too Many Items Rented");
		}
		for (UserItem u : user1.get().getItems()) {
			if (u.getTimestamp() != null) {
				if (u.getTimestamp().toInstant().isAfter(dateDue.toInstant())) {
					count++;
				}
			}
		}
		if (count >= 3) {
			throw new Exception("User Has Over 3 Items Overdue");
		}
		if (item.isPresent() && user1.isPresent()) {
			item.get().addUser(user1.get(), Ownership.valueOf(relation), dateToday);
			itemRepo.save(item.get());
			userRepo.save(user1.get());
			return new ResponseEntity<Item>(item.get(), HttpStatus.CREATED);
		}
		else {
			throw new Exception("Item or User Doesnt Exist");
		}
	}
	
	@GetMapping("/user/{userid}/item/delete/{itemid}")
	public ResponseEntity<Item> removeItemFromUser(@PathVariable("itemid") Integer itemid, @PathVariable("userid") Integer userid) throws Exception{
		Optional<Item> item = itemRepo.findById(itemid);
		Optional<User> user1 = userRepo.findById(userid);

		if (item.isPresent() && user1.isPresent()) {
			UserItem ui = user1.get().getItems().stream().filter(u -> u.getItem().equals(item.get())).findFirst().orElse(null);
			if (ui != null) {
				uiRepo.delete(ui);
				user1.get().getItems().remove(ui);
				ui.setItem(null);
				ui.setUser(null);
				item.get().setStock(item.get().getStock() + 1);
				itemRepo.save(item.get());
				userRepo.save(user1.get());
				return new ResponseEntity<Item>(item.get(), HttpStatus.OK);
			}
			else {
				throw new Exception("User Doesnt Own Item");
			}
		}
		else {
			throw new Exception("User or Item Doesnt Exist");
		}
	}
		
	
	@PutMapping("/user/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user) throws Exception{
		Optional<User> user1 = userRepo.findById(id);
		if (user1.isPresent()) {
			user1.get().setUsername(user.getUsername());
			user1.get().setPassword(user.getPassword());
			user1.get().setEmail(user.getEmail());
			return new ResponseEntity<User>(userRepo.save(user1.get()), HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist");
		}
	}
}
