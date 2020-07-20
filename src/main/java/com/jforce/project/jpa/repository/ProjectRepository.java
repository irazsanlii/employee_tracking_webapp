package com.jforce.project.jpa.repository;

import com.jforce.project.jpa.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Iraz Şanlı
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
