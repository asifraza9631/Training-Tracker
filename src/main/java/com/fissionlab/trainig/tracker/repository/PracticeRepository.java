package com.fissionlab.trainig.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.Practice;

@Repository
public interface PracticeRepository extends JpaRepository<Practice, String> {

	List<Practice> findByNameContainingIgnoreCase(String name);

}
