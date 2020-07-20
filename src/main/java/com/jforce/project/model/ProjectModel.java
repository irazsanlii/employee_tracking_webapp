package com.jforce.project.model;

import com.jforce.project.jpa.entity.EmployeeRole;
import com.jforce.project.jpa.entity.EmployeeStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author Iraz Şanlı
 */
@Getter
@Setter
@ToString
public class ProjectModel {
    private String projectName;
    private Date startDate;
    private Date endDate;
    private String client;

}