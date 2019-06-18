package com.ust.training.web.rest.service;

import com.ust.training.web.rest.model.Employee;

import java.util.List;

public interface EmployeeService {
    String addEmployee(Employee employee);
    List<Employee> getEmployeesDetails();
    Employee getEmployee(Integer id);
}
