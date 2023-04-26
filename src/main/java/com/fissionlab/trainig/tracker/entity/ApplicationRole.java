package com.fissionlab.trainig.tracker.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name = "application_role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRole {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;

    @OneToMany(mappedBy = "applicationRole")
    private List<EmployeeOrgApplicationRole> employeeOrgApplicationRoles;

}
