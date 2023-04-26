package com.fissionlab.trainig.tracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_skill_mapping")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeSkillMapping {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    private boolean isPrimary;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;
}
