package com.dataforge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataforge.dao.EmployeeDao;
import com.dataforge.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public String registerEmployee(Employee emp) {
		
		Employee save = employeeDao.save(emp);
		
		if(save.getId()==null) {
			return "Should not Empty";
		}
		return "Register Sucessfully";
	}

	@Override
	public Employee loginCheck(String email, String pwd) {
		Employee fingByEmailAndPwd = employeeDao.findByEmailAndPwd(email, pwd);
		
		return fingByEmailAndPwd;
	}

}
