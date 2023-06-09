package com.fissionlab.trainig.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "organization ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

    @Id
    private String id;
    private String name;



}
