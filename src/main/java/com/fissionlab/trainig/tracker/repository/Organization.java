package com.fissionlab.trainig.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Organization extends JpaRepository<Organization, String> {
}
