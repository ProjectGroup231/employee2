package com.project.employee.domain;
//
import java.util.List;

import com.project.employee.model.EmployeeModel;

public interface EmployeeDomain {

	String addEmployee(EmployeeModel employeeModel);
	List<EmployeeModel> findAllEmployee();
}
