package com.maxiflexy.employee_mgt_system.repository;

import com.maxiflexy.employee_mgt_system.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
}
