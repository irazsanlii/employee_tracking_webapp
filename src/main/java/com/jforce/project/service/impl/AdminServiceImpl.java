package com.jforce.project.service.impl;

import com.jforce.project.exception.GenericException;
import com.jforce.project.exception.Throw;
import com.jforce.project.jpa.entity.Employee;
import com.jforce.project.jpa.entity.EmployeeStatus;
import com.jforce.project.jpa.entity.Project;
import com.jforce.project.jpa.entity.Team;
import com.jforce.project.jpa.repository.EmployeeRepository;
import com.jforce.project.jpa.repository.ProjectRepository;
import com.jforce.project.jpa.repository.TeamRepository;
import com.jforce.project.model.*;
import com.jforce.project.service.AdminService;
import com.jforce.project.util.DateUtils;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Iraz Şanlı
 */
@Service
public class AdminServiceImpl implements AdminService {
    private final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public LoginModel addUser(NewUserModel user) throws GenericException {
        logger.info("New user will be added.");
        try {
            Employee entity = new Employee();

            entity.setEmail(user.getEmail());
            entity.setPassword(user.getPassword());
            entity.setFullname(user.getFullname());
            entity.setPhone(user.getPhone());
            entity.setDepartment(user.getDepartment());
            entity.setEmployeeRole(user.getEmployeeRole());
            entity.setEmployeeStatus(EmployeeStatus.ACTIVE);
            entity.setCreated_at(DateUtils.getCurrentTime());

            entity = employeeRepository.save(entity);

            return modelMapper.map(entity, LoginModel.class);
        } catch (Exception e) {
            Throw.throwException(e);
            return null;
        }
    }

    @Override
    public ProjectModel addProject(NewProjectModel project) throws GenericException {
        logger.info("New project will be added.");
        try {
            Project entity = new Project();

            entity.setProjectName(project.getProjectName());
            entity.setClient(project.getClient());
            entity.setStartDate(project.getStartDate());
            entity.setEndDate(project.getEndDate());

            entity = projectRepository.save(entity);

            return modelMapper.map(entity, ProjectModel.class);
        } catch (Exception e) {
            Throw.throwException(e);
            return null;
        }
    }

    @Override
    public TeamModel addTeam(TeamModel team) throws GenericException {
        logger.info("New team will be added.");
        try {
            Team entity = new Team();
            entity.setTeamName(team.getTeamName());

            entity = teamRepository.save(entity);

            return modelMapper.map(entity, TeamModel.class);
        } catch (Exception e) {
            Throw.throwException(e);
            return null;
        }
    }

}
