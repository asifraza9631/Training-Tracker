package com.fissionlab.trainig.tracker.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee_audit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAudit {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    private String eventType;
    private LocalDateTime eventDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;
}

