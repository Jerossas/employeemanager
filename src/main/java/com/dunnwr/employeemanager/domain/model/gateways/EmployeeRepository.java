package com.dunnwr.employeemanager.domain.model.gateways;

import com.dunnwr.employeemanager.domain.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee save(Employee employee);
    List<Employee> findAll();
    void deleteById(Long id);
}
