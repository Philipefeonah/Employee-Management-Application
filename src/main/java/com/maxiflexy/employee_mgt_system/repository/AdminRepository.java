package com.maxiflexy.employee_mgt_system.repository;

import com.maxiflexy.employee_mgt_system.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByEmail(String email);

}
