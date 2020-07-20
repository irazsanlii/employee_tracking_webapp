package com.jforce.project.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author Iraz Şanlı
 */
@Data
@Entity
@Table(name = "card",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"card_id"})})
public class DailyWorkCard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "card_id", nullable = false)
    private Long cardId;

    /*
    @ManyToOne // Bir çalışan bir gün için birden fazla iş kartı oluşturabilir.
    @JoinColumn(name = "employee_id")
    private Employee employee;
    */
    /*
    @Column(name = "card_owner", nullable = false) // Kart sahibinin serviste çağırılması için değişken tipi hatasını kontrol altına aldık.
    private Long cardOwner;
    */

    /*
    @Column(name = "start_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Column(name = "end_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
     */

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    // Bir kartta birden fazla proje bulunabilir.
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk_card", cascade=CascadeType.ALL)
    private Set<ProjectsOnCards> projectsOnCards;

    /*
    @Column(name = "modified_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    */

    public DailyWorkCard() {

    }

}