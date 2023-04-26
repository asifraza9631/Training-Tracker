package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {
}
