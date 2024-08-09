package com.maxiflexy.employee_mgt_system.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String errorMessage;
    private String errorDetails;

}
