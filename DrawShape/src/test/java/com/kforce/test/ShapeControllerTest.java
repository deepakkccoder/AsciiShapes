package com.kforce.test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.kforce.controller.ShapeController;
import com.kforce.service.ShapeService;

public class ShapeControllerTest {
	@Mock
	private ShapeService shapeService;
	
	@InjectMocks
	private ShapeController shapeController;
	private MockMvc mockMvc;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(shapeController).build();
	}

	@Test
	public void testDrawShape() throws Exception {
		mockMvc.perform(get("/shape")).andExpect(status().isOk()).andExpect(view().name("selectshape"));
	}
	@Test
	public void testDisplayShape() throws Exception {
		when(shapeService.getShape("Circle", 5)).thenReturn(new String());
	}

}
