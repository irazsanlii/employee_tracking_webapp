package com.jforce.project.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

// Çalışanların projelerde çalışma saatleri birim maliyetin hesabı için gereklidir.
// Projeler ve kartlar ilişkisi çalışma saatlerini içermelidir.
// DB niteliklerini JPA sınıflarının tutulduğu alanlarla eşleştirdiğimizden bu ilişki için de yeni bir varlık sınıfı oluşturulur.

/**
 * @author Iraz Şanlı
 */
@Data
@Entity
@Table(name = "card_project")
/*
@AssociationOverrides({
        @AssociationOverride(name = "pk_card",
                joinColumns = @JoinColumn(name = "card_id")),
        @AssociationOverride(name = "pk_project",
                joinColumns = @JoinColumn(name = "project_id")) })

 */
public class ProjectsOnCards implements Serializable {
    /*
    @EmbeddedId
    private ProjectsOnCardsKey projectsOnCardsKey;

    @ManyToOne
    private DailyWorkCard dailyWorkCard;

    @ManyToOne
    private Project project;

     */
    @Id
    @ManyToOne
    @JoinColumn
    private DailyWorkCard pk_card;

    @Id
    @ManyToOne
    @JoinColumn
    private Project pk_project;

    private Integer workingHours;

    public ProjectsOnCards(){
    }

}