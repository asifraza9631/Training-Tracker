package com.fissionlab.trainig.tracker.DTO;

import com.fissionlab.trainig.tracker.entity.Project;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ClientDTO {
    private String id;


    private String name;


    private String status;


    private String orgId;


    private LocalDateTime startDate;


    private LocalDateTime endDate;

    private List<ProjectDTO> projects;

    private  ManagerDTO managerDTO;

}
