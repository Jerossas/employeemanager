package com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa;

import com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<EmployeeEntity, Long> {}
