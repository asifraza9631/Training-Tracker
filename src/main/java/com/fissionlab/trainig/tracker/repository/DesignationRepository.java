package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Designation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, String> {

	List<Designation> findByNameContainingIgnoreCase(String name);
	
}
