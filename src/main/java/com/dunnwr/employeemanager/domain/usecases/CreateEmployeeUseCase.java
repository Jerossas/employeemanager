package com.dunnwr.employeemanager.domain.usecases;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;

import java.util.UUID;


public class CreateEmployeeUseCase implements UseCase<Employee, Employee> {

    private final EmployeeRepository employeeRepository;

    public CreateEmployeeUseCase(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee execute(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
