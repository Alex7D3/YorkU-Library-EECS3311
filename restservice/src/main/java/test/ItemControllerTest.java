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
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.yorku.library.restservice.controllers.ItemController;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.repositories.ItemRepo;

@SpringBootTest(classes = ItemController.class)
@ComponentScan("com.example")
@AutoConfigureMockMvc
class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemRepo itemRepo;
	
    @InjectMocks
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
	}
	  
	@Test
	void testGetItemById() throws Exception {
	    mockMvc.perform(get("http://localhost:8080/item/{id}", 189))
	            .andExpect(status().isOk());
	    }
}
