package com.fissionlab.trainig.tracker.DTO;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.entity.Practice;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
public class PracticeDTO {

	private String name;
	private String type;
	private String orgId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;



}
