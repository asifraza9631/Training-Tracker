package com.fissionlab.trainig.tracker.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee_allocation_audit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeAllocationAudit {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne
    @JoinColumn(name = "employee_allocation_id")
    private EmployeeAllocation employeeAllocation;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "event_date")
    private LocalDateTime eventDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;
}

