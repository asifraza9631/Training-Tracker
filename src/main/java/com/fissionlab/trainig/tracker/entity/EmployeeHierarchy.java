package com.fissionlab.trainig.tracker.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_hierarchy")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EmployeeHierarchy {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    private String name;
    private String designation;
    private int leftVal;
    private int rightVal;


}
