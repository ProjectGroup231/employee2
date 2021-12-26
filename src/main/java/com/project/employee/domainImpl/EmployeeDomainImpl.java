package com.project.employee.domainImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//

import com.project.employee.domain.EmployeeDomain;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;
import com.project.employee.repositories.EmployeeRepositories;

@Component
public class EmployeeDomainImpl implements EmployeeDomain {
	@Autowired

	private EmployeeRepositories empRepo;

	public String addEmployee(EmployeeModel employeeModel) {
		Employee emp = new Employee();
		emp.setName(employeeModel.getName());
		emp.setAdd(employeeModel.getAdd());
		emp.setPost(employeeModel.getPost());
		emp.setSalary(employeeModel.getSalary());
		empRepo.save(emp);
		return "employee added successfully";

	}
	
	@Override
	public List<EmployeeModel> findAllEmployee() {
		List<EmployeeModel> empModelList = new ArrayList<>();
		List<Employee> emps = empRepo.findAll();
		for (Employee emp : emps) {
			empModelList.add(new EmployeeModel(emp.getId(), emp.getName(), emp.getAdd(), emp.getPost(),emp.getSalary()));
		}
		return empModelList;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee employee1 = empRepo.save(employee);
		return employee1;
	}

		
	

}
