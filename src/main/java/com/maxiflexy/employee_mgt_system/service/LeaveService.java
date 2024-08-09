package com.maxiflexy.employee_mgt_system.service;

import com.maxiflexy.employee_mgt_system.entity.Leave;
import java.util.List;

public interface LeaveService {

    List<Leave> getAllLeave();

    Leave processLeave(Leave leave);

    void denyLeave(Long leaveId);

    void approveLeave(Long leaveId);


}
