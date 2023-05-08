package com.fissionlab.trainig.tracker.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client_tlb")
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

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Project> projects = new ArrayList<>();


	@OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
	@JsonManagedReference
	private Manager manager;

	public  void setManager(Manager manager)
	{
		 if(manager !=null)
		 {
			   manager.setClient(this);
		 }
		 this.manager= manager;
	}

	// Constructor, getters and setters
}
