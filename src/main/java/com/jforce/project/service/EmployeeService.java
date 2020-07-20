package com.jforce.project.service;

import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.entity.DailyWorkCard;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.model.CardModel;
import com.jforce.project.model.DailyWorkCardModel;
import com.jforce.project.model.TeamModel;

import java.util.List;

/**
 * @author Iraz Şanlı
 */
public interface EmployeeService {
    Employee login(String email, String password) throws GenericException;

    void logout(Long employeeId) throws GenericException;

    public String resetPasswordFor(Long employeeId) throws GenericException;

    CardModel addDailyWorkCard(DailyWorkCardModel card) throws GenericException;

}
