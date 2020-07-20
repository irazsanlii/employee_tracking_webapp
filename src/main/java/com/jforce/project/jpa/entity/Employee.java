package com.jforce.project.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Iraz Şanlı
 */
@Data
@Entity // Employee sınıfının veri tabanında kaydedilebilir bir öge (entity) dir.
@Table(name = "employee", // Çalışanlara ait veriler "employee" tablosuna kaydedilecektir. Burada "id, telefon, mail adresi" değerleri tektir.
        uniqueConstraints = {@UniqueConstraint(columnNames = {"employee_id", "email", "phone"})})
public class Employee implements Serializable { // Serileştirme, tablodaki değerlerin veri tipleri ile birlikte kaydedilmesini sağlayacaktır.
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Her yeni kayıt için "id" otomatik olarak arttırılır.
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @Column(name = "email", nullable = false, length = 64)
    private String email;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @Column(name = "fullname", nullable = false, length = 64)
    private String fullname;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "department", nullable = false)
    private String department;

    // Sistem kullanıcılarının farklı yetkileri olabilir.
    @Column(name = "employee_role", nullable = false, columnDefinition = "bpchar")
    @Enumerated(EnumType.STRING)
    private EmployeeRole employeeRole;

    // Çalışanın firmadaki görevinin aktif/pasif durumu tutulabilir.
    @Column(name = "employee_status", nullable = false, columnDefinition = "bpchar")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    /*
    @OneToMany // Çalışan bir gün için birden fazla iş kartı oluşturabilir.
    @JoinColumn(name="card_id")
    private Collection<DailyWorkCard> card = new ArrayList<DailyWorkCard>();


    // Çalışanlar ve ekipleri arasındaki ilişki gösterilmelidir.
    // Bir çalışan birden fazla ekipte yer alabilir (M). Öte yandan bir ekipte de birden fazla çalışan bulunabilir (N).
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "employees_teams",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<Team> teams;


     */
    public Employee() {
    }
}