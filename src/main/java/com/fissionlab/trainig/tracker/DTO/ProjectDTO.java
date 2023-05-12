package com.fissionlab.trainig.tracker.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProjectDTO {
	private String id;

	private String name;

	private String type;

	private String clientId;

	private String orgId;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

}
