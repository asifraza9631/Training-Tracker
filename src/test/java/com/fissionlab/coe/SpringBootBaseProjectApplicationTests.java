package com.fissionlab.coe;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
@Disabled

@SpringBootTest
@TestPropertySource(properties = {
		"spring.datasource.url=jdbc:tc:postgresql:14-alpine:///todos"
})
class SpringBootBaseProjectApplicationTests {

	@Test
	void contextLoads() {
	}

}
