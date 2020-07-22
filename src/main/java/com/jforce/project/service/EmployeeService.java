package com.jforce.project.service;

import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.model.DailyWorkCardModel;
import com.jforce.project.model.request.NewDailyWorkCard;

/**
 * @author Iraz Şanlı
 */
public interface EmployeeService {
    Employee login(String email, String password) throws GenericException;

    void logout(Long employeeId) throws GenericException;

    public String resetPasswordFor(Long employeeId) throws GenericException;

    DailyWorkCardModel addDailyWorkCard(NewDailyWorkCard card
                                        //, Long employeeId
    ) throws GenericException;

}
