
package com.gl.empmgmt.service;

import java.util.List;

import com.gl.empmgmt.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();

	public Employee saveEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployeeById(int id);
}