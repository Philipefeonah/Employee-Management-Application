package com.maxiflexy.employee_mgt_system.service.impl;

import com.maxiflexy.employee_mgt_system.entity.Employee;
import com.maxiflexy.employee_mgt_system.repository.EmployeeRepository;
import com.maxiflexy.employee_mgt_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployeesBasicInfo() {

        // Fetch all employees from the repository
        List<Employee> employeeList = employeeRepository.findAll();

        // Iterate through the list of employees and remove salary and token fields
        for(Employee employee : employeeList){
            //employee.setSalary(null);
            employee.setEmployeeToken(null);
        }

        return employeeList;
    }
}
