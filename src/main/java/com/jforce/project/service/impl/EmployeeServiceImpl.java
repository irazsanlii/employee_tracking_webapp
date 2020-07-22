package com.jforce.project.service.impl;

import com.jforce.project.exception.ErrorCode;
import com.jforce.project.exception.GenericException;
import com.jforce.project.exception.Throw;
import com.jforce.project.jpa.entity.DailyWorkCard;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.jpa.repository.DailyWorkCardRepository;
import com.jforce.project.jpa.repository.EmployeeRepository;
import com.jforce.project.jpa.repository.ProjectRepository;
import com.jforce.project.model.DailyWorkCardModel;
import com.jforce.project.model.request.NewDailyWorkCard;
import com.jforce.project.service.EmployeeService;
import com.jforce.project.util.DateUtils;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Iraz Şanlı
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    protected static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private DailyWorkCardRepository dailyWorkCardRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    @Transactional
    public Employee login(String email, String password) throws GenericException {
        logger.info("Login with email {}", email);
        try {
            Employee entity = new Employee();

            if (entity == null) {
                Throw.throwException(ErrorCode.USER_DOES_NOT_EXIST);
            }

            if (!entity.getPassword().equals(password)) {
                throw new IllegalArgumentException(String.valueOf(ErrorCode.WRONG_PASSWORD));
            }

            return entity;

        } catch (GenericException e) {
            throw e;
        } catch (Exception e) {
            Throw.throwException(e);
            return null;
        }
    }

    @Override
    public void logout(Long employeeId) {

    }

    @Override
    public String resetPasswordFor(Long employeeId) {
        return null;
    }

    @Override
    public DailyWorkCardModel addDailyWorkCard(NewDailyWorkCard card
                                               //, Long employeeId
    ) throws GenericException {
        logger.info("New card will be added.");

        try {
            DailyWorkCard entity = new DailyWorkCard();
            //entity.setCardOwner(employeeId);
            entity.setProjects(card.getProjectList());
            entity.setStartTime(card.getStartTime());
            entity.setEndTime(card.getEndTime());
            entity.setDate(card.getDate());

            entity = dailyWorkCardRepository.save(entity);

            return modelMapper.map(entity, DailyWorkCardModel.class);
        } catch (Exception e) {
            Throw.throwException(e);
            return null;
        }
    }

    /*
    @Override
    public String resetPasswordFor(Long employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        Long password = StringProecessUtil.randomString(8);
        employee.setPassword(password);
        adminRepository.save(employee);
        return password;
    }*/

}
