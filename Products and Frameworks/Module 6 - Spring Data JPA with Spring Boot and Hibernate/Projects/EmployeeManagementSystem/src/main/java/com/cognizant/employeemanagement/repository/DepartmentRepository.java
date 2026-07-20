package com.cognizant.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeemanagement.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByName(String name);
}
