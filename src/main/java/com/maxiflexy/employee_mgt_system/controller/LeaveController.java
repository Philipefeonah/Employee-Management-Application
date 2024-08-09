package com.maxiflexy.employee_mgt_system.controller;

import com.maxiflexy.employee_mgt_system.entity.Leave;
import com.maxiflexy.employee_mgt_system.service.LeaveService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class LeaveController {

    private LeaveService leaveService;

    @GetMapping("/leave")
    public String listAllLeave(Model model){
        model.addAttribute("leave", leaveService.getAllLeave());
        return "leave";
    }

    @GetMapping("/leave/form")
    public String showLeaveForm(Model model) {
        model.addAttribute("leave", new Leave());
        return "leave_application";
    }

    @PostMapping("/leave/form")
    public String submitLeaveForm(Leave leave) {
        leaveService.processLeave(leave);
        return "approved";
    }


}
