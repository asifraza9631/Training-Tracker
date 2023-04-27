package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, String> {


}
