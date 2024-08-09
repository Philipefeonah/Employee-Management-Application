package com.maxiflexy.employee_mgt_system.service;

import com.maxiflexy.employee_mgt_system.entity.Attendance;
import java.util.List;


public interface AttendanceService {

    List<Attendance> getAllAttendance();
    Attendance addAttendance(Attendance attendance);

}
