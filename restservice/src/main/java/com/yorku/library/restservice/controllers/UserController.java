package com.yorku.library.restservice.controllers;

import java.sql.Date;

import java.util.ArrayList;
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
	
	
	@GetMapping("/user/login/{email}/{pw}")
	public ResponseEntity<User> userLogin(@PathVariable("email") String email, @PathVariable("pw") String pw) throws Exception{
		User user = userRepo.findByEmail(email).get(0);
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
		String roleString = "STUDENTS";
		Role role1 = Role.valueOf(roleString);
		System.out.println(role1);
		
		User user = new User(username, pw, email, role1);
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/user/{id}/items")
	public ResponseEntity<List<Item>> getUserItems(@PathVariable("id") Integer id) throws Exception{
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
	
	@GetMapping("/user/{id}/courses")
	public ResponseEntity<List<Course>> getUserCourses(@PathVariable("id") Integer id) throws Exception{
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
	
	@PostMapping("/user/addcourse/{code}")
	public ResponseEntity<Course> addCourse(@PathVariable("code") String code, @RequestBody User user) throws Exception{
		User user1 = user;
		Course course = courseRepo.findByCourseCode(code).get(0);
		if (course != null) {
			course.addUser(user1);
			userRepo.save(user1);
			courseRepo.save(course);
			return new ResponseEntity<Course>(course, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Course Doesnt Exist");
		}
	}
	
	@DeleteMapping("/user/dropcourse/{code}")
	public ResponseEntity<Course> removeCourse(@PathVariable("code") String code, @RequestBody User user) throws Exception {
		User user1 = user;
		Course course = courseRepo.findByCourseCode(code).get(0);
		if (user1.getCourses().contains(course)) {
			course.removeUser(user1.getId());
			courseRepo.save(course);
			userRepo.save(user1);
			return new ResponseEntity<Course>(course, HttpStatus.OK);
		}
		else {
			throw new Exception("Course Doesnt Exist or User Not Enrolled");
		}
	}
	
	@PostMapping("/user/request/{id}/{priority}")
	public ResponseEntity<Request> requestItem(@PathVariable("id") Integer id, Integer priority, @RequestBody User user) throws Exception{
		User user1 = user;
		Item item = itemRepo.findById(id).get();
		if (item != null) {
			Request req = new Request(priority, user1, item);
			user1.addRequest(req);
			item.setRequest(req);
			itemRepo.save(item);
			userRepo.save(user1);
			requestRepo.save(req);
			return new ResponseEntity<Request>(req, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
	@GetMapping("/user/notifs")
	public void userNotifs() {
		
	}
	
	@PostMapping("/user/item/add/{relation}/{id}")
	public ResponseEntity<Item> addItemToUser(@PathVariable("relation") Ownership relation, @PathVariable("id") Integer id, @RequestBody User user, @RequestParam Date date) throws Exception{
		Item item = itemRepo.findById(id).get();
		User user1 = user;
		if (user1.getItems().size() >= 10) {
			throw new Exception("User Has Too Many Items Rented");
		}
		if (item != null) {
			item.addUser(user1, relation, date);
			itemRepo.save(item);
			userRepo.save(user1);
			return new ResponseEntity<Item>(item, HttpStatus.CREATED);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
	@DeleteMapping("/user/item/delete/{id}")
	public ResponseEntity<Item> removeItemFromUser(@PathVariable("id") Integer id, @RequestBody User user) throws Exception{
		Item item = itemRepo.findById(id).get();
		User user1 = user;
		try {
			item.removeUser(user1.getId());
		}
		catch (Exception e) {
			throw e;
		}
		itemRepo.save(item);
		userRepo.save(user1);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	@PutMapping("/user/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user) throws Exception{
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
