package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import com.yorku.library.restservice.models.Book;
import com.yorku.library.restservice.models.Course;
import com.yorku.library.restservice.models.Faculty;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.models.NewsLetter;
import com.yorku.library.restservice.models.Ownership;
import com.yorku.library.restservice.models.Request;
import com.yorku.library.restservice.models.Role;
import com.yorku.library.restservice.models.SpecialItem;
import com.yorku.library.restservice.models.Staff;
import com.yorku.library.restservice.models.Student;
import com.yorku.library.restservice.models.TextBook;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.models.UserItem;
import com.yorku.library.restservice.models.Visitor;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
	
	@Test
	public void userTest() {
		User user1 = new User();
		assertNull(user1.getUsername());
		User user2 = new User("username", "password", "email", null);
		assertEquals(user2.getEmail(), "email");
		assertEquals(user2.getPassword(), "password");
		assertEquals(user2.getUsername(), "username");
		user1.setRole(Role.STUDENTS);
		assertEquals(user1.getRole(), Role.STUDENTS);
		user1.setId(300);
		assertTrue(user1.getId() == 300);
		user1.setEmail("email1");
		user1.setPassword("pw1");
		user1.setUsername("user2");
		user1.setVerified(true);
		assertTrue(user1.isVerified());
		assertEquals(user1.getEmail(), "email1");
		assertEquals(user1.getPassword(), "pw1");
		assertEquals(user1.getUsername(), "user2");
	}
	
	@Test
	public void staffTest() {
		Staff staff0 =  new Staff();
		assertNull(staff0.getUsername());
		Staff staff1 = new Staff("staff1", "staff1pw", "staff1email");
		assertEquals(staff1.getRole(), Role.NON_FACULTY_STAFF);
	}
	
	@Test
	public void studentTest() {
		Student student0 =  new Student();
		assertNull(student0.getUsername());
		Student student1 = new Student("student1", "student1pw", "student1email", "123456");
		assertEquals(student1.getStudentNum(), "123456");
		student1.setStudentNum("654321");
		assertEquals(student1.getStudentNum(), "654321");
		assertEquals(student1.getRole(), Role.STUDENTS);
	}
	
	@Test
	public void facultyTest() {
		Faculty faculty0 =  new Faculty();
		assertNull(faculty0.getUsername());
		Faculty faculty1 = new Faculty("faculty1", "faculty1pw", "faculty1email", "789101");
		assertEquals(faculty1.getStaffNum(), "789101");
		faculty1.setStaffNum("101987");
		assertEquals(faculty1.getStaffNum(), "101987");
		assertEquals(faculty1.getRole(), Role.FACULTY);
	}
	
	@Test
	public void visitorTest() {
		Visitor visitor0 =  new Visitor();
		assertNull(visitor0.getUsername());
		Visitor visitor1 = new Visitor("staff1", "staff1pw", "staff1email");
		assertEquals(visitor1.getRole(), Role.VISITOR);
	}
	
	@Test
	public void itemTest() {
		Item item1 = new Item();
		assertNull(item1.getTitle());
		Item item2 = new Item("item1", "desc1", "here", null);
		assertEquals(item2.getDescription(), "desc1");
		assertEquals(item2.getLocation(), "here");
		assertNull(item2.getImage());
		assertEquals(item2.getTitle(), "item1");
		assertTrue(item2.getStock() == 20);
		item1.setId(240);
		assertTrue(item1.getId() == 240);
		item1.setDescription("desc0");
		item1.setLocation("loc0");
		item1.setTitle("name0");
		item1.setStock(19);
		assertEquals(item1.getDescription(), "desc0");
		assertEquals(item1.getLocation(), "loc0");
		assertEquals(item1.getTitle(), "name0");
		assertTrue(item1.getStock() == 19);
	}
	
	@Test
	public void bookTest() {
		Book book0 = new Book();
		assertNull(book0.getTitle());
		Book book1 = new Book("book1", "bdesc", "bloc", "1234", null);
		assertEquals(book1.getIsbn(), "1234");
		book0.setIsbn("5678");
		assertEquals(book0.getIsbn(), "5678");
	}
	
	@Test
	public void nlTest() {
		NewsLetter nl0 = new NewsLetter();
		assertNull(nl0.getTitle());
		NewsLetter nl1 = new NewsLetter("letter1", "ndesc", "nloc", null, "nyt");
		assertEquals(nl1.getSource(), "nyt");
		nl0.setSource("Tstar");
		assertEquals(nl0.getSource(), "Tstar");
	}
	
	@Test
	public void siTest() {
		SpecialItem si0 = new SpecialItem();
		assertNull(si0.getTitle());
		SpecialItem si1 = new SpecialItem("sitem1", "sdesc", "sloc", null, "disk");
		assertEquals(si1.getMediaType(), "disk");
		si0.setMediaType("audio");
		assertEquals(si0.getMediaType(), "audio");
	}

	@Test
	public void tbTest() {
		TextBook tb0 = new TextBook();
		assertNull(tb0.getTitle());
		TextBook tb1 = new TextBook("tb1", "tdesc", "tloc", null, null);
		assertEquals(tb1.getTitle(), "tb1");
	}
	
	@Test
	public void courseTest() {
		Date date = new Date(1);
		Course course = new Course();
		course.setCourseCode("CS1");
		course.setCourseTitle("cs");
		course.setId(20);
		course.setEndDate(date);
		assertEquals(course.getCourseCode(), "CS1");
		assertEquals(course.getCourseTitle(), "cs");
		assertEquals(course.getEndDate(), date);
		assertTrue(course.getId() == 20);
		User user1 = new User();
		course.addUser(user1);
		TextBook tb = new TextBook();
		course.addBook(tb);
		assertTrue(course.getTextbooks().size() == 1);
		assertTrue(course.getTextbooks().contains(tb));
		assertTrue(user1.getCourses().contains(course));
		course.removeUser(user1.getId());
		course.removeBook(tb.getId());
		assertFalse(course.getTextbooks().contains(tb));
		assertFalse(user1.getCourses().contains(course));
		course.removeUser(user1.getId());
		course.removeBook(tb.getId());
		assertTrue(course.getTextbooks().size() == 0);
		assertTrue(user1.getCourses().size() == 0);
	}
	
	@Test
	public void requestTest() {
		Request req0 = new Request();
		req0.setId(99);
		req0.setPriority(9);
		assertTrue(req0.getId() == 99);
		assertTrue(req0.getPriority() == 9);
		User user = new User();
		Item item = new Item();
		Request req1 = new Request(1, user, item);
		assertTrue(req1.getPriority() == 1);
		user.addRequest(req1);
		item.setRequest(req1);
		assertTrue(user.getRequests().size() == 1);
		assertTrue(user.getRequests().contains(req1));
		assertEquals(item.getRequest(), req1);
		user.removeRequest(user.getId());
		assertTrue(user.getRequests().size() == 0);
		assertFalse(user.getRequests().contains(req1));
	}
	
	@Test
	public void userItemTest() {
		Date date = new Date(12);
		User user = new User();
		Item item = new Item();
		item.setStock(1);
		UserItem ui1 = new UserItem();
		ui1.setOwntype(Ownership.SUBSCRIBED);
		assertEquals(ui1.getOwntype(), Ownership.SUBSCRIBED);
		ui1.setItem(item);
		ui1.setUser(user);
		ui1.setTimestamp(date);
		assertEquals(ui1.getTimestamp(), date);
		assertEquals(ui1.getItem(), item);
		assertEquals(ui1.getUser(), user);
		try {
			item.addUser(user, Ownership.PURCHASED, date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(user.getItems().size() == 1);
		try {
			item.addUser(user, Ownership.PURCHASED, date);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Out Of Stock");
		}
		
	}
}