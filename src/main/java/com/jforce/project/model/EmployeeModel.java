package com.jforce.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
/**
 * @author Iraz Şanlı
 */
public class EmployeeModel {
    private Long id;
    private String email;
    private String password;
}
