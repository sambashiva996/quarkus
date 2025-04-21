package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.employeeEntity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@ApplicationScoped
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>{

}
