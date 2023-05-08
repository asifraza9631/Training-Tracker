package com.fissionlab.trainig.tracker.DTO;

import com.fissionlab.trainig.tracker.entity.Departments;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDTO {

    private String orgEmpId;
    private String firstName;
    private String lastName;
    private String email;
    private String type;
    private String designation;
    private boolean isBillable;
    private String practice;
    private LocalDateTime expStartDate;
    private LocalDateTime fissionStartDate;
    private String contactNumber;
    private String status;

    private Departments departments;
    private String gender;
    private String location;
    private String nickname;
    private boolean isActive;
    private String notes;
    private String createdBy;
    private LocalDateTime createdTime;
    private String modifiedBy;
    private LocalDateTime modifiedTime;

}
