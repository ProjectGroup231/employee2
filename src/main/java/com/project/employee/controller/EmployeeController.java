package com.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.Service.EmployeeService;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;
//abc
@RestController
@RequestMapping("/employee")

public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeeModel empModel) {
		String response = empService.addEmployee(empModel);
		return response;
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public List<EmployeeModel> findAllEmployee(){
		List<EmployeeModel> response  =empService.findAllEmployee();
		return response;
}
	@RequestMapping(value ="/update", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee response = empService.updateEmployee(employee);
		return response;
		
	}
}
