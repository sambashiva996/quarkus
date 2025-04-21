package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


import org.acme.employeeEntity.EmployeeEntity;
import org.acme.repository.EmployeeRepository;

@ApplicationScoped
public class EmployeeServiceImpl implements EmployeeService{

	
	  @Inject
		EmployeeRepository empRepo;
		public void save(EmployeeEntity emp) {
			
			empRepo.save(emp);
		}

		public List<EmployeeEntity> getEmployeeData(){
			return empRepo.findAll();
		}

}
