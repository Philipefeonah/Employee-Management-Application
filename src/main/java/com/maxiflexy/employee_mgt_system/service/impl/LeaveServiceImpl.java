package com.maxiflexy.employee_mgt_system.service.impl;

import com.maxiflexy.employee_mgt_system.entity.Leave;
import com.maxiflexy.employee_mgt_system.repository.LeaveRepository;
import com.maxiflexy.employee_mgt_system.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {

    private LeaveRepository leaveRepository;

    @Autowired
    public LeaveServiceImpl(LeaveRepository leaveRepository){
        this.leaveRepository = leaveRepository;
    }
    @Override
    public List<Leave> getAllLeave() {
        return leaveRepository.findAll();
    }

    @Override
    public Leave processLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    @Override
    public void denyLeave(Long leaveId) {

    }

    @Override
    public void approveLeave(Long leaveId) {

    }
}
