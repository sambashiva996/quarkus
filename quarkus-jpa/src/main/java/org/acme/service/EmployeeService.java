package org.acme.service;

import java.util.List;

import org.acme.employeeEntity.EmployeeEntity;



public interface EmployeeService {

	public void save(EmployeeEntity emp);
	public List<EmployeeEntity> getEmployeeData();
}
