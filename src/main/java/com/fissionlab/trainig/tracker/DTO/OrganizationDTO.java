package com.fissionlab.trainig.tracker.DTO;

import java.util.List;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDTO {

	@Id
	private String id;
	private String name;

	List<DepartmentDTO> departments;

	List<DesignationDTO> designations;

	List<PracticeDTO> practices;

	List<SkillsDTO> skills;

		

}
