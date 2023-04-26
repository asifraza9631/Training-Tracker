package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.ApplicationRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRoleRepository extends JpaRepository<ApplicationRole, String> {
}
