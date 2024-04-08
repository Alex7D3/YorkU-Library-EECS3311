package test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
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
import com.yorku.library.restservice.models.Role;
import com.yorku.library.restservice.models.User;
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
	
    @InjectMocks
    private UserController userCont;
    
    @BeforeEach
    public void setUp() {
    	User user = new User("name", "pw", "email", Role.STUDENTS);
    	user.setId(189);
    	when(userRepo.findById(189))
            .thenReturn(Optional.of(user));
	}
	
	@Test
	void contextLoads() {
	}
	  
	@Test
	void testGetUserById() throws Exception {
	    mockMvc.perform(get("http://localhost:8080/item/{id}", 189))
	            .andExpect(status().isOk());
	    }
}
