package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.util.Optional;

import jakarta.servlet.ServletContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.yorku.library.restservice.controllers.ItemController;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.repositories.ItemRepo;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootTest(classes = ItemController.class)
@ComponentScan("com.example")
@AutoConfigureMockMvc
@EnableWebMvc
class ItemControllerTest {
	@Autowired
	private WebApplicationContext webApplicationContext;
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemRepo itemRepo;

    @InjectMocks
	@Autowired
    private ItemController itemCont;
    
    @BeforeEach
    public void setUp() {
    	Item item = new Item("test", "testdesc", "library", null);
    	item.setId(189);
    	when(itemRepo.findById(189))
            .thenReturn(Optional.of(item));
	}
	
	@Test
	void contextLoads() {
		ServletContext servletContext = webApplicationContext.getServletContext();

		assertNotNull(servletContext);
		assertTrue(servletContext instanceof MockServletContext);
		assertNotNull(webApplicationContext.getBean("ItemController"));
	}
	  
	@Test
	void testGetItemById() throws Exception {
	    mockMvc.perform(get("http://localhost:8080/item/{id}", 189).accept(MediaType.APPLICATION_JSON))
	            .andExpect(status().isOk());
	    }
}
