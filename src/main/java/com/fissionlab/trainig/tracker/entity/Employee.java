package com.fissionlab.trainig.tracker.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


import java.time.LocalDateTime;

@Entity
@Table(name = "employees_tbl")
@Data
public class Employee {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "org_id")
    private  String orgId;

    @Column(name = "org_emp_id")
    private String orgEmpId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "type")
    private String type;

    @Column(name = "designation")
    private String designation;

    @Column(name = "billable")
    private boolean billable;

    @Column(name = "practice")
    private String practice;

    @Column(name = "exp_start_date")
    private LocalDateTime expStartDate;

    @Column(name = "fission_start_date")
    private LocalDateTime fissionStartDate;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "status")
    private String status;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporting_manager_id")
    private Employee reportingManager;


     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Departments department;



    @Column(name = "gender")
    private String gender;

    @Column(name = "location")
    private String location;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "active")
    private boolean active;

    @Column(name = "notes", length = 750)
    private String notes;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdTime")
    private LocalDateTime createdTime;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @Column(name = "modifiedTime")
    private LocalDateTime modifiedTime;

    // Constructors, getters and setters, and other methods omitted for brevity
}
