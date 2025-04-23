package com.salinokl.springboot;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleServiceTest {
	@Autowired
	ExampleService service;

	@Test
	void testExampleService() {
		try {
			String response = service.someRestCall()
						.bodyToMono(String.class)
						.block();
					
			System.out.println(response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
