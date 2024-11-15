package com.kubernates.kuberDemo.api;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> allEmp = Arrays.asList(
            new Employee(1,"Sivateja","M"),
            new Employee(2, "Malli","Adra"),
            new Employee(3,"Akhil","kapadam"));

    public List<Employee> getAllEmployee(){
        return allEmp;
    }
}
