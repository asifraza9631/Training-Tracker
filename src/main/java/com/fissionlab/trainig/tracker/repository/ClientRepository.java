package com.fissionlab.trainig.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

	List<Client> findByNameContainingIgnoreCase(String name);

}
