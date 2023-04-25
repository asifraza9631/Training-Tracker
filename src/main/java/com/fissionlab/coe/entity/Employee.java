package com.fissionlab.coe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "employee")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false)
    private String firstName;
	
	@Column(name =  "last_name", nullable = false)
    private String lastName;
	
	@Column(name = "email_address", nullable = false)
    private String emailId;

    @Column(name =  "phone")
    private  String phone;
    public Employee(String firstName, String lastName, String emailId, String phone) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.emailId = emailId;
         this.phone = phone;
    }    

    }
