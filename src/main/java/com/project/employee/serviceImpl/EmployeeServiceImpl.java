package com.project.employee.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.Service.EmployeeService;
import com.project.employee.domain.EmployeeDomain;
import com.project.employee.model.EmployeeModel;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired

	private EmployeeDomain empDomain;

	@Override
	public String addEmployee(EmployeeModel employeemodel) {
		String result = empDomain.addEmployee(employeemodel);
		return result;

	}

}
