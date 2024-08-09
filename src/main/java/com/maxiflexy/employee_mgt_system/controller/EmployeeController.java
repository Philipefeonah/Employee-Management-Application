package com.maxiflexy.employee_mgt_system.controller;

import com.maxiflexy.employee_mgt_system.entity.Employee;
import com.maxiflexy.employee_mgt_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String listAllEmployees(Model model){
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }

    @GetMapping("/employees/new")
    public String createEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "create_employee";
    }


    @PostMapping("/employees/add")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/employees";
    }


    @PostMapping("/employees/{id}")
    public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee, Model model){
        Employee existingEmployee = employeeService.getEmployeeById(id);
        existingEmployee.setFullName(employee.getFullName());
        existingEmployee.setMobileNumber(employee.getMobileNumber());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setEmployeeToken(employee.getEmployeeToken());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());

        employeeService.updateEmployee(existingEmployee);
        return "redirect:/employees";
    }


    @GetMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);

        return "redirect:/employees";
    }


    @GetMapping("/employees/update/{id}")
    public String editEmployeeForm(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "edit_employee";
    }


    @GetMapping("/employees/basic")
    public String getAllEmployeesBasic(Model model) {
        List<Employee> employees = employeeService.getAllEmployeesBasicInfo();
        model.addAttribute("employees", employees);
        return "employees_basic";
    }





}
