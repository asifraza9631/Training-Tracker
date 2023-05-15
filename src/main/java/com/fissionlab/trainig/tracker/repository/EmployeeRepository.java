package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    Employee findByOrgEmpId(String orgEmpId);
    
    @Query(value = "select * from employees_tbl where email=?1",nativeQuery = true)
    Employee findByEmail(String email);
}
