package com.ust.training.web.rest.service;

import com.ust.training.web.rest.data.EmployeeDataProcessor;
import com.ust.training.web.rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDataProcessor employeeDataProcessor;

    @Override
    public String addEmployee(Employee employee) {
        if(employeeDataProcessor.addEmployeesData(employee)){
            return "Employee data added successfully..!!!";
        }
        return "Failed to add Employee data..!!!";
    }

    @Override
    public List<Employee> getEmployeesDetails() {
        return employeeDataProcessor.getEmployeesData();
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeDataProcessor.getEmployee(id);
    }
}
