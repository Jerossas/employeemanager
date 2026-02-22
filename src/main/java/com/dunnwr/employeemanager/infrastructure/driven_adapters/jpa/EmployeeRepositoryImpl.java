package com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa;

import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeJpaRepository jpaRepository;

    public EmployeeRepositoryImpl(EmployeeJpaRepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }
}
