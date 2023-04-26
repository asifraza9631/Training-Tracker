package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.EmployeeAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAllocationRepository extends JpaRepository<EmployeeAllocation, String> {
}
