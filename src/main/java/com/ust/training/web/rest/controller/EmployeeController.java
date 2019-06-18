package com.ust.training.web.rest.controller;

import com.ust.training.web.rest.model.Employee;
import com.ust.training.web.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="listAll", produces = "application/json")
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployeesDetails();
    }

    @GetMapping(path="/", produces = "application/json")
    public Employee getEmployee(@RequestParam Integer id)
    {
        return employeeService.getEmployee(id);
    }

    @PostMapping(path= "add", consumes = "application/json", produces = "application/json")
    public String addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }
}