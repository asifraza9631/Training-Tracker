package com.fissionlab.trainig.tracker.service.impl;

import com.fissionlab.trainig.tracker.repository.ProjectRepository;
import com.fissionlab.trainig.tracker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

      @Autowired
     private ProjectRepository projectRepository;

}
