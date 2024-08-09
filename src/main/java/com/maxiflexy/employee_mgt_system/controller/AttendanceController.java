package com.maxiflexy.employee_mgt_system.controller;

import com.maxiflexy.employee_mgt_system.entity.Attendance;
import com.maxiflexy.employee_mgt_system.service.AttendanceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@AllArgsConstructor
@Controller
public class AttendanceController {

    private AttendanceService attendanceService;

    @GetMapping("/attendance")
    public String listAllAttendance(Model model){
        model.addAttribute("attendance", attendanceService.getAllAttendance());
        return "attendance";
    }

    @GetMapping("/attendance/form")
    public String showAttendanceForm(Model model) {
        Attendance attendance = new Attendance();
        model.addAttribute("attendance", attendance);
        return "attendance_form";
    }


    @PostMapping("/attendance/form")
    public String saveAttendance(@ModelAttribute("attendance") Attendance attendance) {
        attendanceService.addAttendance(attendance);
        return "welcome";
    }



}
