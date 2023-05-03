package com.fissionlab.trainig.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.Departments;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments, String> {

	List<Departments> findByNameContainingIgnoreCase(String name);

}