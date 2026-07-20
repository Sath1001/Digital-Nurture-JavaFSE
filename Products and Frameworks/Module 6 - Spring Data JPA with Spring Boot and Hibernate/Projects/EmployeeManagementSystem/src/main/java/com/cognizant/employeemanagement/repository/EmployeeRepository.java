package com.cognizant.employeemanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.projection.EmployeeProjection;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByDepartmentName(String departmentName);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findByCustomEmail(@Param("email") String email);

    Employee findByEmailNamed(@Param("email") String email);

    Page<Employee> findAll(Pageable pageable);

    List<EmployeeProjection> findProjectedBy();
}
