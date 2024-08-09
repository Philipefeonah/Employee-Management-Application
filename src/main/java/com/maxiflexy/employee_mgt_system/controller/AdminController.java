package com.maxiflexy.employee_mgt_system.controller;

import com.maxiflexy.employee_mgt_system.entity.Admin;
import com.maxiflexy.employee_mgt_system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }

    @GetMapping("/admin")
    public String loginForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "admin";
    }

    @PostMapping("/admin")
    public String processLogin(Admin login, RedirectAttributes redirectAttributes) {
        boolean isValid = adminService.isValidAdmin(login.getEmail(), login.getPassword());
        if (isValid) {
            return "redirect:/employees";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid email or password.");
            return "redirect:/admin";
        }
    }

}
