package com.yorku.library.restservice;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.yorku.library.restservice.controllers.UserController;
import com.yorku.library.restservice.models.Course;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.models.Role;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.repositories.CourseRepo;
import com.yorku.library.restservice.repositories.ItemRepo;
import com.yorku.library.restservice.repositories.RequestRepo;
import com.yorku.library.restservice.repositories.UserItemRepo;
import com.yorku.library.restservice.repositories.UserRepo;

@SpringBootTest(classes = UserController.class)
@ComponentScan("com.example")
@AutoConfigureMockMvc
@EnableWebMvc
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserRepo userRepo;
	@MockBean
	private CourseRepo courseRepo;
	@MockBean
	private RequestRepo reqRepo;
	@MockBean
	private ItemRepo itemRepo;
	@MockBean
	private UserItemRepo uiRepo;
	
    @InjectMocks
    private UserController userCont;

	@Test
	void contextLoads() {
	}
	  
	@Test
	void testUserLogin() throws Exception {
		User user = new User("name", "pw", "email@mail.com", Role.STUDENTS);
    	user.setId(189);
    	when(userRepo.findByEmail("email@mail.com"))
            .thenReturn(user);
    	
	    mockMvc.perform(get("http://localhost:8080/user/login/{email}/{pw}", "email@mail.com", "pw"))
	            .andExpect(status().isOk());
	    }
	
	@Test
	void testRegister() throws Exception {
		mockMvc.perform(post("http://localhost:8080/user/register/{username}/{email}/{pw}/{role}", "test", "testmail", "testpw", "FACULTY"))
				.andExpect(status().isCreated());
	}
	
	@Test
    public void testGetUserItems() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.STUDENTS);
        user.setId(189);
        Item item1 = new Item("Item 1", "Description 1", "location", null);
        Item item2 = new Item("Item 2", "Description 2", "location2", null);
        item1.addUser(user, null, null);
        item2.addUser(user, null, null);

        when(userRepo.findById(189)).thenReturn(Optional.of(user));

        mockMvc.perform(get("/user/189/items"))
               .andExpect(status().isOk());
    }
	
	@Test
    public void testGetUserCourses() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.STUDENTS);
        user.setId(189);
        Course course1 = new Course();
        Course course2 = new Course();
        course1.addUser(user);
        course2.addUser(user);
        
        when(userRepo.findById(189)).thenReturn(Optional.of(user));

        mockMvc.perform(get("/user/189/courses"))
               .andExpect(status().isOk());
    }
	
	@Test
    public void testAddCourse() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.STUDENTS);
        user.setId(189);
        
        Course course = new Course();
        course.setCourseCode("EECS3311");
        
        when(userRepo.findById(189)).thenReturn(Optional.of(user));
        when(courseRepo.findByCourseCode("EECS3311")).thenReturn(List.of(course));

        mockMvc.perform(get("/user/189/addcourse/EECS3311"))
               .andExpect(status().isCreated());
    }
	
	@Test
    public void testRemoveCourse() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.STUDENTS);
        user.setId(189);
        
        Course course = new Course();
        course.addUser(user);
        course.setCourseCode("EECS3311");
        
        when(userRepo.findById(189)).thenReturn(Optional.of(user));
        when(courseRepo.findByCourseCode("EECS3311")).thenReturn(List.of(course));

        mockMvc.perform(get("/user/189/dropcourse/EECS3311"))
               .andExpect(status().isOk());
    }
	
	@Test
    public void testRequestItem() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.NON_FACULTY_STAFF);
        user.setId(189);
        Item item = new Item("TestItem", "Test description", "location1", null);
        item.setId(189);

        when(userRepo.findById(189)).thenReturn(Optional.of(user));
        when(itemRepo.findById(189)).thenReturn(Optional.of(item));
        
        mockMvc.perform(get("/user/189/request/189/1"))
               .andExpect(status().isCreated());
    }
	
	@Test
    public void testAddItemToUser() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.FACULTY);
        user.setId(189);

        Item item = new Item("TestItem", "Test description", "location", null);
        item.setId(189);

        when(userRepo.findById(189)).thenReturn(Optional.of(user));
        when(itemRepo.findById(189)).thenReturn(Optional.of(item));

        mockMvc.perform(get("/user/189/item/add/PURCHASED/189"))
                .andExpect(status().isCreated());
    }
	
    @Test
    public void testRemoveItemFromUser() throws Exception {
        User user = new User("TestUser", "password", "test@example.com", Role.FACULTY);
        user.setId(189);

        Item item = new Item("TestItem", "Test description", "location", null);
        item.setId(189);

        item.addUser(user, null, null);

        when(userRepo.findById(189)).thenReturn(Optional.of(user));
        when(itemRepo.findById(189)).thenReturn(Optional.of(item));

        mockMvc.perform(get("/user/189/item/delete/189"))
                .andExpect(status().isOk());
    }
}


