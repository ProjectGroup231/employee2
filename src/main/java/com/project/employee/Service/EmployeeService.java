package com.project.employee.Service;
//
import java.util.List;

import com.project.employee.model.EmployeeModel;

public interface EmployeeService {

	String addEmployee(EmployeeModel employeeModel);
	List<EmployeeModel> findAllEmployee();
	
}
