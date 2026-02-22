package com.dunnwr.employeemanager.domain.usecases;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;


public class CreateEmployeeUseCase implements UseCase<Employee, Employee> {

    private final EmployeeRepository employeeRepository;

    public CreateEmployeeUseCase(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee execute(Employee employee){
        return employeeRepository.save(employee);
    }
}
