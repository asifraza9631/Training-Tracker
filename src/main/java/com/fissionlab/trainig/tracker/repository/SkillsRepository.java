package com.fissionlab.trainig.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, String> {

	List<Skills> findByNameContainingIgnoreCase(String name);
}
