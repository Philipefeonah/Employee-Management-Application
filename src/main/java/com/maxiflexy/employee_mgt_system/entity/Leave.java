package com.maxiflexy.employee_mgt_system.entity;

import com.maxiflexy.employee_mgt_system.enums.LeaveType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "leave_Table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startLeave;

    private LocalDateTime endLeave;

    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;

    @ManyToOne
    Employee employeeId;

}
