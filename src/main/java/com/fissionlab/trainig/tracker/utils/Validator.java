package com.fissionlab.trainig.tracker.utils;

import com.fissionlab.trainig.tracker.DTO.EmployeeDTO;
import com.fissionlab.trainig.tracker.exception.CustomValidationException;

public class Validator {

    public static void  isValidate(EmployeeDTO employeeDTO) throws CustomValidationException {
        if (employeeDTO.getOrgEmpId() == null || employeeDTO.getOrgEmpId().isEmpty() ) {
            throw new CustomValidationException("OrgEmpId cannot be null or empty");
        }
        if(!employeeDTO.getOrgEmpId().startsWith("FL"))
        {
            throw new CustomValidationException("OrgEmpId not start with FL");
        }

        if (employeeDTO.getFirstName() == null || employeeDTO.getFirstName().isEmpty()) {
            throw new CustomValidationException("First Name cannot be null or empty");
        }
        if (employeeDTO.getLastName() == null || employeeDTO.getLastName().isEmpty()) {
            throw new CustomValidationException("Last Name cannot be null or empty");
        }
        if (employeeDTO.getEmail() == null || employeeDTO.getEmail().isEmpty()) {
            throw new CustomValidationException("Email cannot be null or empty");
        }
        if (employeeDTO.getType() == null || employeeDTO.getType().isEmpty()) {
            throw new CustomValidationException("Type cannot be null or empty");
        }
        if (employeeDTO.getDesignation() == null || employeeDTO.getDesignation().isEmpty()) {
            throw new CustomValidationException("Designation cannot be null or empty");
        }
        if (employeeDTO.getPractice() == null || employeeDTO.getPractice().isEmpty()) {
            throw new CustomValidationException("Practice cannot be null or empty");
        }
        if (employeeDTO.getContactNumber() == null || employeeDTO.getContactNumber().isEmpty()) {
            throw new CustomValidationException("Contact Number cannot be null or empty");
        }
        if (employeeDTO.getStatus() == null || employeeDTO.getStatus().isEmpty()) {
            throw new CustomValidationException("Status cannot be null or empty");
        }
        if (employeeDTO.getDepartments() == null) {
            throw new CustomValidationException("Department cannot be null");
        }
        if (employeeDTO.getGender() == null || employeeDTO.getGender().isEmpty()) {
            throw new CustomValidationException("Gender cannot be null or empty");
        }
        if (employeeDTO.getLocation() == null || employeeDTO.getLocation().isEmpty()) {
            throw new CustomValidationException("Location cannot be null or empty");
        }
        if (employeeDTO.getNickname() == null || employeeDTO.getNickname().isEmpty()) {
            throw new CustomValidationException("Nickname cannot be null or empty");
        }
        if (employeeDTO.getNotes() == null || employeeDTO.getNotes().isEmpty()) {
            throw new CustomValidationException("Notes cannot be null or empty");
        }
        if (employeeDTO.getCreatedBy() == null || employeeDTO.getCreatedBy().isEmpty()) {
            throw new CustomValidationException("Created By cannot be null or empty");
        }
        if (employeeDTO.getModifiedBy() == null || employeeDTO.getModifiedBy().isEmpty()) {
            throw new CustomValidationException("Modified By cannot be null or empty");
        }
    }

}
