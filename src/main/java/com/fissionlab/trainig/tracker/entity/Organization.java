package com.fissionlab.trainig.tracker.entity;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "organization ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/users/v1/organization")
public class Organization {

	@Id
	private String id;
	private String name;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	 * "organization")
	 * 
	 * @JsonBackReference private List<Skills> skills = new ArrayList<>();
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	 * "organization")
	 * 
	 * @JsonBackReference private List<Designation> designations = new
	 * ArrayList<>();
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	 * "organization")
	 * 
	 * @JsonBackReference private List<Practice> practices = new ArrayList<>();
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	 * "organization")
	 * 
	 * @JsonBackReference private List<Departments> departments = new ArrayList<>();
	 */
}