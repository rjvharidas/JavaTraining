package com.ust.training.web.rest.data;

import com.ust.training.web.rest.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDataProcessor {
    private static List<Employee> employeeList = new ArrayList<>();

    public boolean addEmployeesData(Employee e){
        return employeeList.add(e);
    }

    public List<Employee> getEmployeesData(){
        return employeeList;
    }

    public Employee getEmployee(Integer id){
       return employeeList.stream().filter(emp -> emp.getId().equals(id)).findFirst().orElse(null);

//        for (Employee emp: employeeList) {
//            if (emp.getId().equals(id)){
//                return emp;
//            }
//        }
//        return null;
    }

}
