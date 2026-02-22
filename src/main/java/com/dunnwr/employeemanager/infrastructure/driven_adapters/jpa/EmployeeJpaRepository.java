package com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa;

import com.dunnwr.employeemanager.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {}
