package com.maxiflexy.employee_mgt_system.service.impl;

import com.maxiflexy.employee_mgt_system.entity.Admin;
import com.maxiflexy.employee_mgt_system.entity.Attendance;
import com.maxiflexy.employee_mgt_system.repository.AdminRepository;
import com.maxiflexy.employee_mgt_system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return null;
    }

    @Override
    public boolean isValidAdmin(String email, String password) {
        Admin admin = adminRepository.findByEmail(email);
        if(admin != null && Objects.equals(admin.getPassword(), password)){
            return true;
        }else {
            return false;
        }
    }
}
