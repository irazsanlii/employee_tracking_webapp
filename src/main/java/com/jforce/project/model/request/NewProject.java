package com.jforce.project.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author Iraz Şanlı
 */
@Getter
@Setter
@ToString
public class NewProject {
    private String projectName;
    private Date startDate;
    private Date endDate;
    private String client;

}