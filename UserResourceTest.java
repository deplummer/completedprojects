package com.example;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.user.User;
import com.revature.user.UserDaoService;
import com.revature.user.UserResource;

public class UserResourceTest {
	
	private static final String Resource = null;
	private static final String ID = "3";
	private static final String PERSON = "Daniel";
	
	@Mock
	private UserResource dao;
	
	@Autowired
	@InjectMocks
	private UserDaoService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
	}

	@Test
	public void testRetrieveUserShouldReturnUser() {
		when(dao.retrieveUser(any(User.class))).thenReturn(Resource);
		int result = dao.retrieveUser(PERSON, ID);
		assertNotNull(result, Resource);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

}
