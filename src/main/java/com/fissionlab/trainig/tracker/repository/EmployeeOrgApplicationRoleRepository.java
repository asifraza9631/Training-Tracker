package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.EmployeeOrgApplicationRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeOrgApplicationRoleRepository extends JpaRepository<EmployeeOrgApplicationRole, String> {
}
