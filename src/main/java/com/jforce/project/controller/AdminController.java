package com.jforce.project.controller;


import com.jforce.project.controller.common.ResponseHolder;
import com.jforce.project.controller.util.Endpoint;
import com.jforce.project.exception.GenericException;
import com.jforce.project.jpa.repository.EmployeeRepository;
import com.jforce.project.model.*;
import com.jforce.project.service.AdminService;
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
public class AdminController {
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

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

    // Admin, "user" rolünde kullanıcı ekleyebilir.
    @RequestMapping(value = Endpoint.Admin.ADD_USER, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ResponseHolder<LoginModel> addUser(@Valid @RequestBody NewUserModel request)
            throws GenericException {
        logger.info("Add user");
        ResponseHolder<LoginModel> response = new ResponseHolder<>();
        response.setResponseData(adminService.addUser(request));
        return response;
    }

    // Admin, yürütülen projeleri ekleyebilir.
    @RequestMapping(value = Endpoint.Admin.ADD_PROJECT, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ResponseHolder<ProjectModel> addProject(@Valid @RequestBody NewProjectModel request)
            throws GenericException {
        logger.info("Add project");
        ResponseHolder<ProjectModel> response = new ResponseHolder<>();
        response.setResponseData(adminService.addProject(request));
        return response;
    }

    // Admin, projelerin takımlarını ekleyebilir.
    @RequestMapping(value = Endpoint.Admin.ADD_TEAMS, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ResponseHolder<TeamModel> addProject(@Valid @RequestBody TeamModel request)
            throws GenericException {
        logger.info("Add team");
        ResponseHolder<TeamModel> response = new ResponseHolder<>();
        response.setResponseData(adminService.addTeam(request));
        return response;
    }

}