package org.academiadecodigo.bootcamp.crudhibernate.dto;

import org.academiadecodigo.bootcamp.crudhibernate.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeToEmployeeDTO {

    // DTO data transfer object

    public EmployeeDto convert(Employee employee) {

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEmail(employee.getEmail());

        return employeeDto;
    }
}
