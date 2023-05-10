package com.fissionlab.trainig.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.DTO.PracticeDTO;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.exception.PracticeNotFoundException;
import com.fissionlab.trainig.tracker.service.impl.PracticeServiceImpl;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class PracticeController {

	@Autowired
	private PracticeServiceImpl practiceService;

	@GetMapping(EndPointConfig.ORGANIZATION_PRACTICE_DETAILS)
	public ResponseEntity<List<PracticeDTO>> getAllPractices() throws PracticeNotFoundException {
		List<PracticeDTO> practices = practiceService.getAllPractices();

		if (practices.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(practices);
		}
	}

	@GetMapping(EndPointConfig.ORGANIZATION_PRACTICE_DETAILS_SEARCH)
	public ResponseEntity<List<PracticeDTO>> searchPracticeBasedOnName(@RequestParam("query") String query)
			throws PracticeNotFoundException {
//		List<Practice> skills = practiceService.getPracticeListBasedOnName(query);

//		if (skills.isEmpty()) {
//			return new ResponseEntity<List<PracticeDTO>>(HttpStatus.NO_CONTENT);
//		} else {
//			return new ResponseEntity<List<PracticeDTO>>(HttpStatus.OK);
//		}
        return null;
	}

}
