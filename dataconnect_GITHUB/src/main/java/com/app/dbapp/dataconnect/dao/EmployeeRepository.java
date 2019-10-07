package com.app.dbapp.dataconnect.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dbapp.dataconnect.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
