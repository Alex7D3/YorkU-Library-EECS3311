package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.yorku.library.restservice.models.Book;
import com.yorku.library.restservice.models.Course;
import com.yorku.library.restservice.models.Faculty;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.models.NewsLetter;
import com.yorku.library.restservice.models.Role;
import com.yorku.library.restservice.models.SpecialItem;
import com.yorku.library.restservice.models.Staff;
import com.yorku.library.restservice.models.Student;
import com.yorku.library.restservice.models.TextBook;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.models.Visitor;

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
		
		Staff staff0 =  new Staff();
		assertNull(staff0.getUsername());
		Staff staff1 = new Staff("staff1", "staff1pw", "staff1email");
		assertEquals(staff1.getRole(), Role.NON_FACULTY_STAFF);
		
		Student student0 =  new Student();
		assertNull(student0.getUsername());
		Student student1 = new Student("student1", "student1pw", "student1email", "123456");
		assertEquals(student1.getStudentNum(), "123456");
		student1.setStudentNum("654321");
		assertEquals(student1.getStudentNum(), "654321");
		assertEquals(student1.getRole(), Role.STUDENTS);
		
		Faculty faculty0 =  new Faculty();
		assertNull(faculty0.getUsername());
		Faculty faculty1 = new Faculty("faculty1", "faculty1pw", "faculty1email", "789101");
		assertEquals(faculty1.getStaffNum(), "789101");
		faculty1.setStaffNum("101987");
		assertEquals(faculty1.getStaffNum(), "101987");
		assertEquals(faculty1.getRole(), Role.FACULTY);
		
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
		
		Book book0 = new Book();
		assertNull(book0.getTitle());
		Book book1 = new Book("book1", "bdesc", "bloc", "1234", null);
		assertEquals(book1.getIsbn(), "1234");
		book0.setIsbn("5678");
		assertEquals(book0.getIsbn(), "5678");
		
		NewsLetter nl0 = new NewsLetter();
		assertNull(nl0.getTitle());
		NewsLetter nl1 = new NewsLetter("letter1", "ndesc", "nloc", null, "nyt");
		assertEquals(nl1.getSource(), "nyt");
		nl0.setSource("Tstar");
		assertEquals(nl0.getSource(), "Tstar");
		
		SpecialItem si0 = new SpecialItem();
		assertNull(si0.getTitle());
		SpecialItem si1 = new SpecialItem("sitem1", "sdesc", "sloc", null, "disk");
		assertEquals(si1.getMediaType(), "disk");
		si0.setMediaType("audio");
		assertEquals(si0.getMediaType(), "audio");

		
		TextBook tb0 = new TextBook();
		assertNull(tb0.getTitle());
		TextBook tb1 = new TextBook("tb1", "tdesc", "tloc", null, null);
		assertEquals(tb1.getTitle(), "tb1");
	}
}
