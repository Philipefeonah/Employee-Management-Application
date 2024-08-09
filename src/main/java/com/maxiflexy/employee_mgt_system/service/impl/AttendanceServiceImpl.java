package com.maxiflexy.employee_mgt_system.service.impl;

import com.maxiflexy.employee_mgt_system.entity.Attendance;
import com.maxiflexy.employee_mgt_system.repository.AttendanceRepository;
import com.maxiflexy.employee_mgt_system.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    private AttendanceRepository attendanceRepository;

    @Autowired
    public AttendanceServiceImpl(AttendanceRepository attendanceRepository){
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance addAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }
}
