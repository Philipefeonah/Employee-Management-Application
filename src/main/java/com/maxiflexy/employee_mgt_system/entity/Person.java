package com.maxiflexy.employee_mgt_system.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private Long mobileNumber;

}
