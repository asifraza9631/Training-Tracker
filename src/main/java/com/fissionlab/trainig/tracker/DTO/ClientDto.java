package com.fissionlab.trainig.tracker.DTO;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ClientDto {
    private String id;


    private String name;


    private String status;


    private String orgId;


    private LocalDateTime startDate;


    private LocalDateTime endDate;

    private List<ProjectDTO> projects;

    private ManagerDto managerDto;

}
