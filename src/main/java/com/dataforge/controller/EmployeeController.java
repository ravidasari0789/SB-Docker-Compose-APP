package com.dataforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dataforge.entity.Employee;
import com.dataforge.service.EmployeeService;

@Controller
public class EmployeeController {

	           @Autowired
	           private EmployeeService employeeService;
	           
	           @GetMapping("/")
	           public String homePage(Model model) {
	        	   
	        	       model.addAttribute("home", new Employee());
	        	       return "home";
	           }
	           
	           @GetMapping("/register")
	           public String registerPage(Model model) {
	        	   
	        	       model.addAttribute("emp", new Employee());
	        	       return "register";
	           }
	           @PostMapping("/handlereg")
	           public String handleRegister(@ModelAttribute("emp") Employee emp, Model model) {
	        	   String registerEmployee = employeeService.registerEmployee(emp);
	        	   
	        	   if(registerEmployee!=null) {
	        		   model.addAttribute("error", registerEmployee);
	        		   return "register";
	        	   }
	        	   model.addAttribute("emp", registerEmployee);
	        	    
	        	       return "redirect:/";
	           }
	           @PostMapping("/handlelogin")
	           public String handleLogin(Employee emp, Model model) {
	        	   Employee loginCheck = employeeService.loginCheck(emp.getEmail(),emp.getPwd());
	        	   
	        	   if(loginCheck.getEmail()==null && loginCheck.getPwd()==null) {
	        		   
	        		                model.addAttribute("error", "Email And Pwd Not found");
	        	   }
	        	   model.addAttribute("login", loginCheck);
	        	       return "dash";
	           }
	           @GetMapping("/dash")
	           public String dashPage(Model model) {
	        	   
	        	       model.addAttribute("home", new Employee());
	        	       return "dash";
	           }
	           
}
