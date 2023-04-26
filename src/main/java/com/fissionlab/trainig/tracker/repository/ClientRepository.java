package com.fissionlab.trainig.tracker.repository;

import com.fissionlab.trainig.tracker.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
}
