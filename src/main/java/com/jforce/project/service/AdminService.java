package com.jforce.project.service;

import com.jforce.project.exception.GenericException;
import com.jforce.project.model.*;

/**
 * @author Iraz Şanlı
 */
public interface AdminService {
    LoginModel addUser(NewUserModel user) throws GenericException;
    ProjectModel addProject(NewProjectModel project) throws GenericException;
    TeamModel addTeam(TeamModel team) throws GenericException;

}
