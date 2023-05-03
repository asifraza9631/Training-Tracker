package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Skills;
import com.fissionlab.trainig.tracker.exception.SkillsNotFoundException;

@Service
public interface SkillsService {

	public List<Skills> getAllSkills() throws SkillsNotFoundException;
	
	public List<Skills> getSkillsListBasedOnName(String name);
	

}
