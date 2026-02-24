package com.dunnwr.employeemanager.domain.usecases;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;

public class FindByIdUseCase implements UseCase<Long, Employee>{

    private final EmployeeRepository employeeRepository;

    public FindByIdUseCase(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee execute(Long id){
        return employeeRepository.findById(id);
    }
}
