package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;

@Repository
public class EmployeeDao {

    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {

        Department d1 = new Department(1, "HR");
        Department d2 = new Department(2, "IT");
        Department d3 = new Department(3, "Finance");

        EMPLOYEE_LIST.add(new Employee(
                1,
                "John",
                50000,
                true,
                d1,
                Arrays.asList("Java", "Spring"),
                new Date()));

        EMPLOYEE_LIST.add(new Employee(
                2,
                "Alice",
                65000,
                true,
                d2,
                Arrays.asList("Angular", "SQL"),
                new Date()));

        EMPLOYEE_LIST.add(new Employee(
                3,
                "David",
                70000,
                false,
                d3,
                Arrays.asList("Python", "AWS"),
                new Date()));
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}