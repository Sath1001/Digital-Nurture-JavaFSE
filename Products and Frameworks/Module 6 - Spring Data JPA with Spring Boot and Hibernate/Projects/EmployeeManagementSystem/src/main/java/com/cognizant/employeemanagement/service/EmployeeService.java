package com.cognizant.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.projection.EmployeeProjection;
import com.cognizant.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Page<Employee> getEmployeesPaginated(int page, int size, String sortBy) {
        return employeeRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }

    public List<EmployeeProjection> getEmployeeProjections() {
        return employeeRepository.findProjectedBy();
    }
}
