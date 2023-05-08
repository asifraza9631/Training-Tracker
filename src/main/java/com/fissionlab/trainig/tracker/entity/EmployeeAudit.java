package com.fissionlab.trainig.tracker.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_audit_tbl")
@Data
public class EmployeeAudit {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "emp_id")
    private String empId;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "event_date")
    private LocalDateTime eventDate;

    @Column(name = "org_id")
    private String orgId;

     @Column(name = "data")
    private  String data;
    // getters and setters
}
