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
@Entity
@Table(name = "card",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"card_id"})})
public class DailyWorkCard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "card_id", nullable = false)
    private Long cardId;

    // Kart sahibinin serviste çağırılması için değişken tipi hatasını kontrol altına aldık, çalışan id'si ile çağırılacak.
    @Column(name = "card_owner", nullable = false)
    private Long cardOwner;

    @Column(name = "start_time", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Column(name = "end_time", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date endTime;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    // Bir kart birden fazla proje içerebilir.
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "projectsOnCards")
    private List<Project> projects;

    /*
    @Column(name = "modified_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    */

    public DailyWorkCard() {

    }

}