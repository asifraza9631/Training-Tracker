package com.fissionlab.trainig.tracker.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PracticeDTO {

	private String id;
	private String name;
	private String orgId;
	private LocalDateTime createdDateTime;
	private LocalDateTime modifiedDateTime;
	

}
