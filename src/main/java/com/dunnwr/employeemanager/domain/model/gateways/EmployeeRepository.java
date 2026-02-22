package com.dunnwr.employeemanager.domain.model.gateways;

import com.dunnwr.employeemanager.domain.model.Employee;

public interface EmployeeRepository {

    Employee save(Employee employee);
}
