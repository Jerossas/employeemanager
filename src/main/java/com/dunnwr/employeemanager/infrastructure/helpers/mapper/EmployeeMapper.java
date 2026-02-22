package com.dunnwr.employeemanager.infrastructure.helpers.mapper;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa.entities.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeEntity toEntity(Employee employee);
    Employee toDomain(EmployeeEntity employee);
}
