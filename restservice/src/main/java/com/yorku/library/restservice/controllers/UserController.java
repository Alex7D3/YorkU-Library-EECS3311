package com.yorku.library.restservice.controllers;

import java.sql.Date;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

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
import com.yorku.library.restservice.repositories.UserRepo;
import com.yorku.library.restservice.security.AES;

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
	private AES aes;
	
	@GetMapping("/user/login/{email}/{pw}")
	public ResponseEntity<User> userLogin(@PathVariable String email, @PathVariable String pw) throws Exception {	
		
			for (User user : userRepo.findByEmail(email)) {
				aes.encrypt(pw);
				if (user.getPassword().equals(pw)) {
					return new ResponseEntity<User>(user, HttpStatus.OK);
				} else {
					throw new Exception("User Doesnt Exist");
				}
			}
		    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED); 
		}
	
	
	@GetMapping("/user/logout")
	public void userLogout() {
		
	}
	
	@PostMapping("/user/register/{username}/{email}/{password}/{role}")
	public ResponseEntity<User> userRegister(@PathVariable String username, @PathVariable String email, @PathVariable String pw, @PathVariable Role role) throws Exception {
		String encryptedPass = aes.encrypt(pw);
		User user = new User(username, email, encryptedPass, role);
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/user/{id}/items")
	public ResponseEntity<List<Item>> getUserItems(@PathVariable Integer id) throws Exception{
		User user = userRepo.findById(id).get();
		if (user != null) {
			List<Item> itemlist = new ArrayList<>();
			user.getItems().forEach(useritem -> itemlist.add(useritem.getItem()));
			return new ResponseEntity<List<Item>>(itemlist, HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist");
		}
	}
	
	@GetMapping("/user/{id}/overdueitems")
	public ResponseEntity<List<Item>> getOverdueItems(@PathVariable Integer id) {
		User user = userRepo.findById(id).get();
		GregorianCalendar dateDue = new GregorianCalendar();
		dateDue.add(Calendar.MONTH, 1);
		List<UserItem> list1 = user.getItems().stream().filter(i -> i.getTimestamp().toInstant().isAfter(dateDue.toInstant())).toList();
		List<Item> itemlist = new ArrayList<>();
		list1.forEach(u -> itemlist.add(u.getItem()));
		return new ResponseEntity<List<Item>>(itemlist, HttpStatus.OK);
		
	}
	
	@GetMapping("/user/{id}/courses")
	public ResponseEntity<List<Course>> getUserCourses(@PathVariable Integer id) throws Exception{
		User user = userRepo.findById(id).get();
		if (user != null) {
			List<Course> courselist = new ArrayList<>();
			courselist.addAll(user.getCourses());
			return new ResponseEntity<List<Course>>(courselist, HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist");
		}
	}
	
	@PostMapping("/user/{id}/addcourse/{code}")
	public ResponseEntity<Course> addCourse(@PathVariable String code, @PathVariable Integer id) throws Exception{
		User user = userRepo.findById(id).get();
		Course course = courseRepo.findByCourseCode(code).get(0);
		if (course != null) {
			course.addUser(user);
			userRepo.save(user);
			courseRepo.save(course);
			return new ResponseEntity<Course>(course, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Course Doesnt Exist");
		}
	}
	
	@DeleteMapping("/user/{id}/dropcourse/{code}")
	public ResponseEntity<Course> removeCourse(@PathVariable String code, @PathVariable Integer id) throws Exception {
		User user = userRepo.findById(id).get();
		Course course = courseRepo.findByCourseCode(code).get(0);
		if (user.getCourses().contains(course)) {
			course.removeUser(user.getId());
			courseRepo.save(course);
			userRepo.save(user);
			return new ResponseEntity<Course>(course, HttpStatus.OK);
		}
		else {
			throw new Exception("Course Doesnt Exist or User Not Enrolled");
		}
	}
	
	@PostMapping("/user/{userid}/request/{itemid}/{priority}")
	public ResponseEntity<Request> requestItem(@PathVariable Integer itemid, Integer priority, @PathVariable Integer userid) throws Exception{
		User user = userRepo.findById(userid).get();
		Item item = itemRepo.findById(itemid).get();
		if (item != null) {
			Request req = new Request(priority, user, item);
			user.addRequest(req);
			item.setRequest(req);
			itemRepo.save(item);
			userRepo.save(user);
			requestRepo.save(req);
			return new ResponseEntity<Request>(req, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
	@PostMapping("/user/{id}/notifs")
	public ResponseEntity<List<String>> userNotifs(@PathVariable Integer id) {
		User user = userRepo.findById(id).get();
		List<String> notis = new ArrayList<>();
		GregorianCalendar dateDue = new GregorianCalendar();
		dateDue.add(Calendar.DATE, 30);
		for (UserItem u : user.getItems()) {
			if (u.getTimestamp().toInstant().isAfter(dateDue.toInstant())) {
				notis.add("One of your items (" + u.getItem().getTitle() + ") are overdue/nearing its due date");
			}
		}
		return new ResponseEntity<List<String>>(notis, HttpStatus.CREATED);
	}
	
	@PostMapping("/user/item/add/{relation}/{id}")
	public ResponseEntity<Item> addItemToUser(@PathVariable Ownership relation, @PathVariable Integer id, @RequestBody User user) throws Exception{
		Item item = itemRepo.findById(id).get();
		User user1 = user;
		GregorianCalendar dateDue = new GregorianCalendar();
		Date dateToday = new Date(dateDue.getTimeInMillis());
		dateDue.add(Calendar.MONTH, 1);
		int count = 0;
		
		
		if (user1.getItems().size() >= 10) {
			throw new Exception("User Has Too Many Items Rented");
		}
		for (UserItem u : user1.getItems()) {
			if (u.getTimestamp().toInstant().isAfter(dateDue.toInstant())) {
				count++;
			}
		}
		if (count >= 3) {
			throw new Exception("User Has Over 3 Items Overdue");
		}
		if (item != null) {
			item.addUser(user1, relation, dateToday);
			itemRepo.save(item);
			userRepo.save(user1);
			return new ResponseEntity<Item>(item, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
	@DeleteMapping("/user/{userid}/item/delete/{itemid}")
	public ResponseEntity<Item> removeItemFromUser(@PathVariable Integer itemid, @PathVariable Integer userid) throws Exception{
		Item item = itemRepo.findById(itemid).get();
		User user = userRepo.findById(userid).get();
		try {
			item.removeUser(user.getId());
		}
		catch (Exception e) {
			throw e;
		}
		itemRepo.save(item);
		userRepo.save(user);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	@PutMapping("/user/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user) throws Exception{
		User user1 = userRepo.findById(id).get();
		if (user1 != null) {
			user1.setUsername(user.getUsername());
			user1.setPassword(user.getPassword());
			user1.setEmail(user.getEmail());
			return new ResponseEntity<User>(userRepo.save(user1), HttpStatus.OK);
		}
		else {
			throw new Exception("User Doesnt Exist");
		}
	}
}
