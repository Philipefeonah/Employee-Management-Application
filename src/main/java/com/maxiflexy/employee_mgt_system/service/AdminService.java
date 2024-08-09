package com.maxiflexy.employee_mgt_system.service;

import com.maxiflexy.employee_mgt_system.entity.Attendance;
import java.util.List;

public interface AdminService {

    List<Attendance> getAllAttendance();
    public boolean isValidAdmin(String email, String password);

}
