package com.fissionlab.trainig.tracker.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectDTO {
    private String id;


    private String name;


    private String type;


    private String clientId;


    private String orgId;


    private LocalDateTime startDate;


    private LocalDateTime endDate;






}
