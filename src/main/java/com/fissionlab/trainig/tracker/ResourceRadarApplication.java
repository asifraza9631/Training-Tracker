package com.fissionlab.trainig.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class ResourceRadarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceRadarApplication.class, args);
		log.info("<<<================================  Resource Radar SERVER STARTED AND RUNNING ================================ >>>");
	}

}
