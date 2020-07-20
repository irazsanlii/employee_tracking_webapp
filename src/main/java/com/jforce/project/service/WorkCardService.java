package com.jforce.project.service;

import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.model.CardModel;

import java.util.Date;
import java.util.List;

public interface WorkCardService {
    CardModel getDailyWorkCard(Date date, Employee employee) throws GenericException;

    List<CardModel> getMyCards() throws GenericException;


}
