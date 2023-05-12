package com.fissionlab.trainig.tracker.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client_tbl")
public class Client {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private String status;

	@Column(name = "org_id")
	private String orgId;

	@Column(name = "start_date")
	private LocalDateTime startDate;

	@Column(name = "end_date")
	private LocalDateTime endDate;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Project> projects;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
	@JsonIgnore
	private List<EmployeeAllocation> allocations;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
	private Manager manager;

	public void setManager(Manager manager) {
		if (manager != null) {
			manager.setClient(this);
		}
		this.manager = manager;
	}

}