package com.dunnwr.employeemanager.infrastructure.helpers.mapper;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa.entities.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeEntity toEntity(Employee employee);
    Employee toDomain(EmployeeEntity employee);
    List<Employee> toDomainList(List<EmployeeEntity> entities);
}
