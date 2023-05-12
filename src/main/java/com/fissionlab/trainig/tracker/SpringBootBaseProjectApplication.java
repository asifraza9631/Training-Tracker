package com.fissionlab.trainig.tracker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class SpringBootBaseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBaseProjectApplication.class, args);
		log.info("<<<================================  SPRING BOOT BASE PROJECT SERVER STARTED AND RUNNING ================================ >>>");

	}

	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}
}
