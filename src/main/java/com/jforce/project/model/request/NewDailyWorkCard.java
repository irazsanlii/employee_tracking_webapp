package com.jforce.project.model.request;

import com.jforce.project.jpa.entity.Project;
import com.jforce.project.model.EmployeeModel;
import com.jforce.project.model.ProjectModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author Iraz Şanlı
 */
@Getter
@Setter
@ToString
public class NewDailyWorkCard {
    private Date startTime;
    private Date endTime;
    private Date date;
    private List<Project> projectList;
}


