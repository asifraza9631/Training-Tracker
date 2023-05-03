package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Skills;
import com.fissionlab.trainig.tracker.exception.SkillsNotFoundException;
import com.fissionlab.trainig.tracker.repository.SkillsRepository;
import com.fissionlab.trainig.tracker.service.SkillsService;

@Service
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	private SkillsRepository skillsRepository;

	@Override
	public List<Skills> getAllSkills() throws SkillsNotFoundException {

		try {
			List<Skills> skills = skillsRepository.findAll();

			return skills;
		} catch (Exception e) {
			throw new SkillsNotFoundException(" Skills Details not found");
		}
	}

	@Override
	public List<Skills> getSkillsListBasedOnName(String name) {

		List<Skills> skills = skillsRepository.findByNameContainingIgnoreCase(name);
		return skills;

	}

}
