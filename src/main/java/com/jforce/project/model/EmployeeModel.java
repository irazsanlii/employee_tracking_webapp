package com.jforce.project.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Iraz Şanlı
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class EmployeeModel {
    private Integer id;
    private String firstname;
    private String minit;
    private String lastname;
    private String phone;
    private String email;
    private String password;
    private Date beginningDate;
    private Date leavingDate;

    public EmployeeModel() {
    }

    public EmployeeModel(
            Integer id,
            String firstname,
            String minit,
            String lastname,
            String phone,
            String email,
            String password,
            Date beginningDate,
            Date leavingDate) {
        this.id = id;
        this.firstname = firstname;
        this.minit = minit;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.beginningDate = beginningDate;
        this.leavingDate = leavingDate;
    }
}