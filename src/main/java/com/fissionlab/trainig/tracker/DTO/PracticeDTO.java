package com.fissionlab.trainig.tracker.DTO;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import com.fissionlab.trainig.tracker.entity.Practice;

import jakarta.persistence.Id;

public class PracticeDTO {
	
	@Id
	private String id;
	
	private String name;
	private Instant createdDateTime;
	private Instant modifiedDateTime;

	public PracticeDTO() {
	}

	public PracticeDTO(Practice practice) {
		this.id = practice.getId();
		this.name = practice.getName();
		this.createdDateTime = practice.getCreatedDateTime();
		this.modifiedDateTime = practice.getModifiedDateTime();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime.atZone(ZoneId.systemDefault()).toInstant();
	}

	public Instant getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime.atZone(ZoneId.systemDefault()).toInstant();
	}
}
