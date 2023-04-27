package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<Practice, String> {
}
