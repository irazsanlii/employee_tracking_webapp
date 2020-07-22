package com.jforce.project.service;

import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.model.DailyWorkCardModel;

import java.util.Date;
import java.util.List;

public interface WorkCardService {
    DailyWorkCardModel getDailyWorkCard(Date date, Employee employee) throws GenericException;

    List<DailyWorkCardModel> getMyCards() throws GenericException;


}
