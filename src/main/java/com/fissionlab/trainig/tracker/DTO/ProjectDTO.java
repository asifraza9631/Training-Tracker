package com.fissionlab.trainig.tracker.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectDTO {

	private String id;
	private String name;
	private String type;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String orgId;
	private String clientId;

}
