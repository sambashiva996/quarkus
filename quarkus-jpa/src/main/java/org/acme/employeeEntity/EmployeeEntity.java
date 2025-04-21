package org.acme.employeeEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

	@Id
	String name;
	String mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
