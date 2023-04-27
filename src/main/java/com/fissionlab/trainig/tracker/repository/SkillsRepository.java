package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, String> {
}
