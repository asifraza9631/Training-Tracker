package com.fissionlab.trainig.tracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private Integer orgEmpId;
    private String fName;
    private String lName;
    private String type;

    @ManyToOne
    @JoinColumn(name = "designation_id")
    private Designation designation;

    private Boolean billable;

    @ManyToOne
    @JoinColumn(name = "practice_id")
    private Practice practice;

    private LocalDateTime expStartDate;
    private LocalDateTime fissionStartDate;
    private String contactNumber;
    private String status;

    @ManyToOne
    @JoinColumn(name = "reporting_manager_id")
    private Employee reportingManager;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;

}
