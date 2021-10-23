package com.example.mvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.mvc.dto.User;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("hello");

		// Text JSON -> Object
		// Object -> Text Json

		// controller req json(text) -> object
		// response object -> json(text)

		var objectMapper = new ObjectMapper();
		
		// object mapper는 get method가 필요함
		var user = new User("steve", 30, "010-2000-6304", "incheon");

		var text = objectMapper.writeValueAsString(user);
		System.out.println(text); // string형태의 json

		// json(text) -> object
		// object mapper는 디폴트 생성자가 필요
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser); // object형태

	}

}
