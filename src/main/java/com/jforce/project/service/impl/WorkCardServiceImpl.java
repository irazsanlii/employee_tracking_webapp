package com.jforce.project.service.impl;

import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.model.DailyWorkCardModel;
import com.jforce.project.service.WorkCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Iraz Şanlı
 */
@Service
public class WorkCardServiceImpl implements WorkCardService {
    private final Logger logger = LoggerFactory.getLogger(com.jforce.project.service.impl.AdminServiceImpl.class);

    @Override
    public DailyWorkCardModel getDailyWorkCard(Date date, Employee employee) throws GenericException {
        return null;
    }

    @Override
    public List<DailyWorkCardModel> getMyCards() throws GenericException {
        return null;
    }

}
