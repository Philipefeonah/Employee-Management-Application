package com.maxiflexy.employee_mgt_system.exception;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
