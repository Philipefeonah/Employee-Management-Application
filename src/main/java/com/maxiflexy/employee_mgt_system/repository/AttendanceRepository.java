package com.maxiflexy.employee_mgt_system.repository;

import com.maxiflexy.employee_mgt_system.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
