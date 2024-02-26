package com.dataforge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataforge.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{

	          public Employee findByEmailAndPwd(String email,String pwd);
}
