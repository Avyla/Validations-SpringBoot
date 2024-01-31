package com.app.controller;

import com.app.controller.dto.EmployeeDTO;
import com.app.entities.EmployeeEntity;
import com.app.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO){
        return new ResponseEntity<>(this.employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
    }

}
