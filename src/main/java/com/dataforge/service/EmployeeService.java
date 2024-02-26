package com.dataforge.service;

import com.dataforge.entity.Employee;

public interface EmployeeService {

	       public String registerEmployee(Employee emp);
	       public Employee loginCheck(String email, String pwd);
}
