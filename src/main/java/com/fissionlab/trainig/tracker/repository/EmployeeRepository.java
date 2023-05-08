package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    Employee findByOrgEmpId(String orgEmpId);
}
