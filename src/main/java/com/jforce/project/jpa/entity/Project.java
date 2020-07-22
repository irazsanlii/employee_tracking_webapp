package com.jforce.project.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Iraz Şanlı
 */
@Data
@Entity
@Table(name = "project",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"project_id"})})
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "project_id", nullable = false)
    private Long projectId;

    @Column(name = "project_name", nullable = false, length = 64)
    private String projectName;

    /*
    @Column(name = "project_status", nullable = false, columnDefinition = "bpchar")
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;
    */

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "client", length = 255)
    private String client;

    // Bir proje birden fazla kartta bulunabilir.
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "added_projects",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id"))
    private List<DailyWorkCard> projectsOnCards;

    // Bir proje için farklı alt ekipler kurulmaktadır.
    @OneToMany(mappedBy = "project")
    private List<Team> teams;

    public Project() {

    }
}