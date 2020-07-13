package com.jforce.project.jpa.repository;

import com.jforce.project.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeId(Long employeeId);

    Employee findByEmail(String email);

}

