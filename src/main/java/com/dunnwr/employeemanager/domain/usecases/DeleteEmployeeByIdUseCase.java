package com.dunnwr.employeemanager.domain.usecases;

import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;

public class DeleteEmployeeByIdUseCase implements UseCase<Long, Void> {

    private final EmployeeRepository employeeRepository;

    public DeleteEmployeeByIdUseCase(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Void execute(Long id){
        employeeRepository.deleteById(id);
        return null;
    }
}
