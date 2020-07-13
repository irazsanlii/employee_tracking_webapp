package com.jforce.project.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Iraz Şanlı
 */
@Data
// Employee sınıfının veri tabanında kaydedilebilir bir öge (entity) olduğuna işaret ettik.
@Entity
// Verilerin kaydedileceği tabloyu belirttik. Email ve telefon formatı kısıtları getirdik.
@Table(name = "employee",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"phone", "email"})})
public class Employee implements Serializable {
    // "id" kolonunu anahtar kolon olarak belirledik.
    @Id
    // Her yeni kayıt için id'nin otomatik arttırılmasını sağladık.
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "employee_id", unique = true, nullable = false)
    private long employeeId;

    @Column(name = "email", unique = true, nullable = false, length = 64)
    private String email;

    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Column(name = "firstname", nullable = false, length = 64)
    private String firstname;

    @Column(name = "minit", length = 64)
    private String minit;

    @Column(name = "lastname", nullable = false, length = 64)
    private String lastname;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "department", nullable = false)
    private String department;

    @ManyToOne
    @JoinColumn(name="MANAGER_ID")
    private Manager manager;

    @Column(name = "ROLE", nullable = false)
    private String role;

    @ManyToMany(mappedBy="employees")
    private List<Project> projects = new ArrayList<Project>();

    @Type(type="yes_no")
    @Column(name = "ENABLE", nullable = false)
    private boolean enabled;

    @Type(type="yes_no")
    @Column(name = "EXPIRED", nullable = false)
    private boolean expired;

    public Employee() {

    }
}