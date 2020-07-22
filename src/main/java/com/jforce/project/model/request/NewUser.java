package com.jforce.project.model.request;

import com.jforce.project.jpa.entity.EmployeeRole;
import com.jforce.project.jpa.entity.EmployeeStatus;
import com.jforce.project.jpa.entity.Team;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Iraz Şanlı
 */
@Getter
@Setter
@ToString
public class NewUser {
    private String email;
    private String password;
    private String fullname;
    private String phone;
    private String department;
    private EmployeeRole employeeRole;
    private EmployeeStatus employeeStatus;
    private Date created_at;

}