package com.fissionlab.trainig.tracker.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.DTO.DepartmentDTO;
import com.fissionlab.trainig.tracker.DTO.DesignationDTO;
import com.fissionlab.trainig.tracker.DTO.OrganizationDTO;
import com.fissionlab.trainig.tracker.DTO.PracticeDTO;
import com.fissionlab.trainig.tracker.DTO.SkillsDTO;
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
import com.fissionlab.trainig.tracker.service.OrganizationService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OrganizationServiceImpl implements OrganizationService {

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

	
	@Override
	public List<Organization> getAllOrganization() {
		return organizationRepository.findAll();
	}

	@Override
	public OrganizationDTO getOrgCompleteDetails(HttpServletRequest request) {
		
		String orgId = request.getHeader("orgId");
		OrganizationDTO org = new OrganizationDTO();
		Optional<Organization> orgOpt = organizationRepository.findById(orgId);
		if (orgOpt.isPresent()) {
			org.setId(orgOpt.get().getId());
			org.setName(orgOpt.get().getName());
		}

		List<Departments> departments = departmentRepository.findAll();

		List<DepartmentDTO> departmentDTOs = new ArrayList<>();

		if (!departments.isEmpty()) {
			 log.info("checking is department empty ");

			for (Departments department : departments) {

				DepartmentDTO departmentDTO = new DepartmentDTO();
				departmentDTO.setId(department.getId());
				departmentDTO.setName(department.getName());
				departmentDTO.setEmail(department.getEmail());
				departmentDTO.setType(department.getType());

				departmentDTOs.add(departmentDTO);
				
				
			}
		}
		org.setDepartments(departmentDTOs);
		
		List<Designation> designations = designationRepository.findAll();
		List<DesignationDTO> designationDTOs = new ArrayList<>();
		if (!designations.isEmpty()) {
			 log.info("checking is department empty ");
			for (Designation designation : designations) {
				DesignationDTO designationDTO = new DesignationDTO();
				designationDTO.setId(designation.getId());
				designationDTO.setName(designation.getName());
				designationDTOs.add(designationDTO);
			}
		}
		org.setDesignations(designationDTOs);

		List<Practice> practices = practiceRepository.findAll();
		List<PracticeDTO> practiceDTOs = new ArrayList<>();
		/*if (!practices.isEmpty()) {
			for (Practice practice : practices) {
				PracticeDTO practiceDTO = new PracticeDTO();
				practiceDTO.setId(practice.getId());
				practiceDTO.setName(practice.getName());
				practiceDTO.setCreatedDateTime(practice.getCreatedDate());
				practiceDTO.setModifiedDateTime(practice.getModifiedDate());
				
				practiceDTOs.add(practiceDTO);
			}
		}
*/		org.setPractices(practiceDTOs);

		List<Skills> skills = skillsRepository.findAll();
		List<SkillsDTO> skillsDTOs = new ArrayList<>();
		if (!skills.isEmpty()) {
			for (Skills skill : skills) {
				SkillsDTO skillsDTO = new SkillsDTO();
				skillsDTO.setId(skill.getId());
				skillsDTO.setName(skill.getName());
				skillsDTOs.add(skillsDTO);
			}
		}
		org.setSkills(skillsDTOs);
		return org;

	}
		
		
	}



