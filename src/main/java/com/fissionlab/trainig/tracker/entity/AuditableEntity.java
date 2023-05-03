package com.fissionlab.trainig.tracker.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AuditableEntity {
	
	
	@JsonProperty("createdBy")
    @Column(name = "created_by")
    private String createdBy;

    @JsonProperty("createdTime")
    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @JsonProperty("modifiedBy")
    @Column(name = "modified_by")
    private String modifiedBy;

    @JsonProperty("modifiedTime")
    @Column(name = "modified_time")
    private LocalDateTime modifiedTime;

}
