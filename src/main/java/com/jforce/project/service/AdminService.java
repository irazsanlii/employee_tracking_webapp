package com.jforce.project.service;

import com.jforce.project.exception.GenericException;
import com.jforce.project.model.*;
import com.jforce.project.model.request.NewProject;
import com.jforce.project.model.request.NewUser;

/**
 * @author Iraz Şanlı
 */
public interface AdminService {
    EmployeeModel addUser(NewUser user) throws GenericException;
    ProjectModel addProject(NewProject project) throws GenericException;
    TeamModel addTeam(TeamModel team) throws GenericException;

}
