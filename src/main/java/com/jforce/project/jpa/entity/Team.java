package com.jforce.project.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Iraz Şanlı
 */
@Data
@Entity
@Table(name = "team",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"team_id"})})
public class Team implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "team_id", nullable = false)
    private Long teamId;

    @Column(name = "team_name", nullable = false, length = 64)
    private String teamName;

    // Bir proje için farklı alt ekipler kurulur.
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    /*
    // Bir takımda birden fazla çalışan bulunabilir (M). Bir çalışan birden fazla takımda da yer alabilir (N).
    @ManyToMany(mappedBy = "teams")
    private List<Employee> employees;
    */

    public Team() {

    }
}