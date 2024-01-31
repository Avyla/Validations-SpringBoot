package com.app.service;

import com.app.controller.dto.EmployeeDTO;
import com.app.entities.DepartmentEntity;
import com.app.entities.EmployeeEntity;
import com.app.persistence.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity saveEmployee(EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = EmployeeEntity
                .builder()
                .name(employeeDTO.getName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .phone(employeeDTO.getPhone())
                .age(employeeDTO.getAge())
                .height(employeeDTO.getHeight())
                .married(employeeDTO.isMarried())
                .dateBirth(employeeDTO.getDateBirth())
                .department(DepartmentEntity
                        .builder()
                        .name(employeeDTO.getDepartment().getName())
                        .city(employeeDTO.getDepartment().getCity())
                        .build())
                .build();
        return this.employeeRepository.save(employeeEntity);
    }

}
