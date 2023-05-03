package com.fissionlab.trainig.tracker.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "practice")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Practice extends AuditableEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "org_id" )
	private String orgId;

//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "org_id", referencedColumnName = "id")
//	@JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
//	private Organization organization;

}
