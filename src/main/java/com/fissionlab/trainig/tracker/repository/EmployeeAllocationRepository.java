package com.fissionlab.trainig.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.EmployeeAllocation;

@Repository
public interface EmployeeAllocationRepository extends JpaRepository<EmployeeAllocation, String>{
	
}
