package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, String> {
}
