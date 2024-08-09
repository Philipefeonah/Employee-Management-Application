package com.maxiflexy.employee_mgt_system.entity;


import com.maxiflexy.employee_mgt_system.enums.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "employee")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Employee extends Person{

    @Enumerated(EnumType.STRING)
    private Department department;

    private Long employeeId;

    private Double salary;

    @Size(min = 5, max = 16, message = "Password must contain at least 5 digits")
    @NotBlank(message = "required!")
    private String employeeToken;

}
