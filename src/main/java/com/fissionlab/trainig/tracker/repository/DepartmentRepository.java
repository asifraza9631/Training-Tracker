package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}
