package com.fissionlab.trainig.tracker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.DTO.DepartmentDTO;
import com.fissionlab.trainig.tracker.DTO.DesignationDTO;
import com.fissionlab.trainig.tracker.DTO.OrganizationDTO;
import com.fissionlab.trainig.tracker.DTO.PracticeDTO;
import com.fissionlab.trainig.tracker.DTO.SkillsDTO;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.entity.Skills;
import com.fissionlab.trainig.tracker.repository.DepartmentRepository;
import com.fissionlab.trainig.tracker.repository.DesignationRepository;
import com.fissionlab.trainig.tracker.repository.OrganizationRepository;
import com.fissionlab.trainig.tracker.repository.PracticeRepository;
import com.fissionlab.trainig.tracker.repository.SkillsRepository;
import com.fissionlab.trainig.tracker.service.impl.OrganizationServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class OrganizationController {

	@Autowired
	private OrganizationServiceImpl organizationService;

	@Autowired
	private OrganizationRepository organizationRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private DesignationRepository designationRepository;

	@Autowired
	private PracticeRepository practiceRepository;

	@Autowired
	private SkillsRepository skillsRepository;

	@GetMapping(EndPointConfig.ORGANIZATION_DETAILS)
	public ResponseEntity<List<Organization>> getAllOrganizations() {
		List<Organization> organizations = organizationService.getAllOrganization();

		if (organizations.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(organizations, HttpStatus.OK);
		}
	}

	@GetMapping("/getorg")
	public OrganizationDTO getOrgCompleteDetails(HttpServletRequest request) {
		String orgId = request.getHeader("orgId");
		OrganizationDTO org = new OrganizationDTO();
		Optional<Organization> orgOpt = organizationRepository.findById(orgId);
		if (orgOpt.isPresent()) {
			org.setId(orgOpt.get().getId());
			org.setName(orgOpt.get().getName());
		}

		List<Departments> departments = departmentRepository.findAll();
		DepartmentDTO departmentDTO = new DepartmentDTO();
		List<DepartmentDTO> departmentDTOs = new ArrayList<>();

		if (!departments.isEmpty()) {

			for (Departments department : departments) {

				departmentDTO.setId(department.getId());
				departmentDTO.setName(department.getName());
				departmentDTO.setEmail(department.getEmail());
				departmentDTO.setType(department.getType());

				departmentDTOs.add(departmentDTO);
			}
		}
		org.setDepartments(departmentDTOs);
		return org;
	}

	@GetMapping("/getorg1")

	public OrganizationDTO getOrgCompleteDetails1(HttpServletRequest request) {

		String orgId = request.getHeader("orgId");

		OrganizationDTO org = new OrganizationDTO();

		Optional<Organization> orgOpt = organizationRepository.findById(orgId);

		if (orgOpt.isPresent()) {
			org.setId(orgOpt.get().getId());
			org.setName(orgOpt.get().getName());
		}
		List<Designation> designations = designationRepository.findAll();
		DesignationDTO designationDTO = new DesignationDTO();
		List<DesignationDTO> designationDTOs = new ArrayList<>();
		if (!designations.isEmpty()) {
			for (Designation designation : designations) {
				designationDTO.setId(designation.getId());
				designationDTO.setName(designation.getName());
				designationDTOs.add(designationDTO);
			}
		}
		org.setDesignations(designationDTOs);
		return org;

	}

	@GetMapping("/getorg2")

	public OrganizationDTO getOrgCompleteDetails2(HttpServletRequest request) {

		String orgId = request.getHeader("orgId");

		OrganizationDTO org = new OrganizationDTO();

		Optional<Organization> orgOpt = organizationRepository.findById(orgId);

		if (orgOpt.isPresent()) {
			org.setId(orgOpt.get().getId());
			org.setName(orgOpt.get().getName());
		}
		List<Practice> practices = practiceRepository.findAll();
		PracticeDTO practiceDTO = new PracticeDTO();
		List<PracticeDTO> practiceDTOs = new ArrayList<>();
		if (!practices.isEmpty()) {
			for (Practice practice : practices) {
				practiceDTO.setId(practice.getId());
				practiceDTO.setName(practice.getName());
				practiceDTOs.add(practiceDTO);
			}
		}
		org.setPractices(practiceDTOs);
		return org;

	}

	@GetMapping("/getorg3")

	public OrganizationDTO getOrgCompleteDetails3(HttpServletRequest request) {

		String orgId = request.getHeader("orgId");

		OrganizationDTO org = new OrganizationDTO();

		Optional<Organization> orgOpt = organizationRepository.findById(orgId);

		if (orgOpt.isPresent()) {
			org.setId(orgOpt.get().getId());
			org.setName(orgOpt.get().getName());
		}
		List<Skills> skills = skillsRepository.findAll();
		SkillsDTO skillsDTO = new SkillsDTO();
		List<SkillsDTO> skillsDTOs = new ArrayList<>();
		if (!skills.isEmpty()) {
			for (Skills skill : skills) {
				skillsDTO.setId(skill.getId());
				skillsDTO.setName(skill.getName());
				skillsDTOs.add(skillsDTO);
			}
		}
		org.setSkills(skillsDTOs);
		return org;

	}
}
