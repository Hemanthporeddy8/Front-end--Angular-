package com.techtalk.spring_crud_app.repository;


import com.techtalk.spring_crud_app.model.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee getByName(String name);

    Employee findByName(String name);

	Optional<Employee> findById(String id);
}
