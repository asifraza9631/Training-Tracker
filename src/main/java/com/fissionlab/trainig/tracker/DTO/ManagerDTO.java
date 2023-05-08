package com.fissionlab.trainig.tracker.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ManagerDTO {

   private String id;

    private String name;

    private  String type;
    private String createdBy;

    private String modifiedBy;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

}
