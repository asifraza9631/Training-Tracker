package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.EmployeeAllocationAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAllocationAuditRepository extends JpaRepository<EmployeeAllocationAudit, String> {
}
