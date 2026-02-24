package com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa;

import com.dunnwr.employeemanager.domain.model.Employee;
import com.dunnwr.employeemanager.domain.model.gateways.EmployeeRepository;
import com.dunnwr.employeemanager.infrastructure.driven_adapters.jpa.entities.EmployeeEntity;
import com.dunnwr.employeemanager.infrastructure.helpers.mapper.EmployeeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeJpaRepository jpaRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeRepositoryImpl(EmployeeJpaRepository jpaRepository, EmployeeMapper employeeMapper){
        this.jpaRepository = jpaRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Employee save(Employee employee){

        EmployeeEntity entity = employeeMapper.toEntity(employee);
        EmployeeEntity savedEntity = jpaRepository.save(entity);

        return employeeMapper.toDomain(savedEntity);
    }

    @Override
    public List<Employee> findAll(){
        return employeeMapper.toDomainList(jpaRepository.findAll());
    }

    @Override
    public Void deleteById(Long id){
        jpaRepository.deleteById(id);
        return null;
    }
}
