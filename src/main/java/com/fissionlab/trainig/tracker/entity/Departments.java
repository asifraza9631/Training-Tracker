package com.fissionlab.trainig.tracker.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departments")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Departments {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "email_alias", nullable = false)
	private String email;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_time")
	private LocalDateTime createdTime;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "modified_time")
	private LocalDateTime modifiedTime;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "org_id", referencedColumnName = "id")
	@JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
	private Organization organization;

	@ManyToOne
	@JoinColumn(name = "parent_department_id")
	private Departments parentDepartment;

	@Column(name = "type", nullable = false)
	private String type;
}
