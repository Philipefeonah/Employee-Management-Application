package com.maxiflexy.employee_mgt_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "attendance")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne  //multiple instances of an entity (many side) are associated with a single instance of another entity(the one)
    @JoinColumn(name = "employee_id")
    Employee employeeId;

    private String employeeName;

    @Column(name = "date")
    private LocalDate date;
}
