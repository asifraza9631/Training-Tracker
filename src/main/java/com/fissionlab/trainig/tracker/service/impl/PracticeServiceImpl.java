package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.exception.PracticeNotFoundException;
import com.fissionlab.trainig.tracker.repository.PracticeRepository;
import com.fissionlab.trainig.tracker.service.PracticeService;

@Service
public class PracticeServiceImpl implements PracticeService {

	@Autowired
	private PracticeRepository practiceRepository;

	@Override
	public List<Practice> getAllPractices() throws PracticeNotFoundException {

		try {
			List<Practice> practices = practiceRepository.findAll();
			return practices;
		} catch (Exception e) {
			throw new PracticeNotFoundException(" Practice Details not found");
		}
	}

	@Override
	public List<Practice> getPracticeListBasedOnName(String name) {

		List<Practice> practices = practiceRepository.findByNameContainingIgnoreCase(name);
		return practices;

	}

}