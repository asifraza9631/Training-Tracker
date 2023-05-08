package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.EmployeeAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAuditRepository extends JpaRepository<EmployeeAudit, String> {



}
