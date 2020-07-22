package com.jforce.project.controller;

import com.jforce.project.controller.common.ResponseHolder;
import com.jforce.project.controller.util.Endpoint;
import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.repository.EmployeeRepository;
import com.jforce.project.model.DailyWorkCardModel;
import com.jforce.project.model.request.NewDailyWorkCard;
import com.jforce.project.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Iraz Şanlı
 */
@RestController
public class EmployeeController {
    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    /*
    @RequestMapping(value = Endpoint.Admin.SHOW_USERS, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ResponseHolder<LoginModel> showUsers(@RequestBody EmployeeModel request) {

        ResponseHolder<LoginModel> response = new ResponseHolder<>();
        response.setResponseData(adminService.addUser(request));
        return response;
    }
    */

    // Çalışan günlük çalışmalarını ekleyebilir.
    @RequestMapping(value = Endpoint.Employee.ADD_CARD, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ResponseHolder<DailyWorkCardModel> addDailyWorkCard(@Valid @RequestBody NewDailyWorkCard request)
            throws GenericException {
        logger.info("Add card");
        ResponseHolder<DailyWorkCardModel> response = new ResponseHolder<>();
        response.setResponseData(employeeService.addDailyWorkCard(request));
        return response;
    }
}