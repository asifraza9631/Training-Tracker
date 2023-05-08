package com.fissionlab.trainig.tracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fissionlab.trainig.tracker.entity.Client;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

	List<Client> findByNameContainingIgnoreCase(String name);

	Optional<Client> findById(String clientId);


	@Modifying
	@Query("UPDATE Client c SET c.status = :status WHERE c.id = :id")
	@Transactional
	int updateClientStatusById(@Param("id") String id, @Param("status") String status);


}
