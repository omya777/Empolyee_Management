package com.empolyee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empolyee.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
