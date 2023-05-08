package com.fissionlab.trainig.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

	List<Project> findByNameContainingIgnoreCase(String query);

}
