package com.fissionlab.trainig.tracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee_allocation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeAllocation {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "is_primary")
    private boolean isPrimary;

    @Column(name = "role")
    private String role;

    @Column(name = "job_type")
    private String jobType;

    @Column(name = "billable")
    private boolean billable;

    @Column(name = "utilization")
    private float utilization;

    @Column(name = "notes")
    private String notes;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;

    // Getters and Setters
}

