package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.EmployeeHierarchy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHierarchyRepository extends JpaRepository<EmployeeHierarchy, String> {
}
