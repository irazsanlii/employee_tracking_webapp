package com.jforce.project.model;

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
public class DailyWorkCardModel {
    private Long id;
    private EmployeeModel employee;
    private Date startTime;
    private Date endTime;
    private Date date;
    private List<ProjectModel> addedProjects;
}
