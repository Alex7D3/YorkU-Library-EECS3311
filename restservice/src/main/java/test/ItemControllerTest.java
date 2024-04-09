package test;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
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
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.yorku.library.restservice.controllers.ItemController;
import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.repositories.ItemRepo;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootTest(classes = ItemController.class)
@ComponentScan("com.example")
@AutoConfigureMockMvc
@EnableWebMvc
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
	void testHello() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetItemById_ValidId() throws Exception {
		mockMvc.perform(get("/item/{id}", 189))
				.andExpect(status().isOk());
	}


	@Test
	void testGetItemsByTitle_ValidTitle() throws Exception {
		mockMvc.perform(get("/item/search/{title}", "Book1"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetItemsByTitle_TitleNotFound() throws Exception {
		mockMvc.perform(get("/item/search/{title}", "Nonexistent"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetItemsByType_ValidType() throws Exception {
		mockMvc.perform(get("/item/search/by/{type}", "Type1"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetItemsByType_TypeNotFound() throws Exception {
		mockMvc.perform(get("/item/search/by/{type}", "NonexistentType"))
				.andExpect(status().isOk());
	}

	@Test
	void testGetAllItems() throws Exception {
		mockMvc.perform(get("/item/all"))
				.andExpect(status().isOk());
	}

	@Test
	void testUpdateItem_ValidIdAndData() throws Exception {
		mockMvc.perform(put("/items/update/{id}", 189)
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"title\":\"Updated Book\",\"description\":\"Updated Description\",\"location\":\"Updated Location\",\"itemType\":\"Updated Type\"}"))
				.andExpect(status().isOk());
	}


}
