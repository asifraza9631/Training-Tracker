package com.fissionlab.trainig.tracker.DTO;

import java.time.LocalDateTime;
import java.util.List;

import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.entity.Project;

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
public class ClientDTO {

	private String id;
	private String name;
	private String status;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String orgId;
	private List<Project> listProjects;
	
	public ProjectDTO entityToClient(Project client) {
		ClientDTO dto = new ClientDTO();
		dto.setName(client.getName());
		return dto;
	}

}
