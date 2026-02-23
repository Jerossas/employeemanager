package com.dunnwr.employeemanager.domain.usecases;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;

import java.util.List;

public class FindAllEmployeesUseCase implements UseCase<Void, List<Employee>> {

    private final EmployeeRepository employeeRepository;

    public FindAllEmployeesUseCase(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> execute(Void input){
        return employeeRepository.findAll();
    }
}
