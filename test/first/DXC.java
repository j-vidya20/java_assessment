package com;

import org.springframework.stereotype.Component;

package com;

public class DXC {
	private int EmployeeId,year;
	private String EmploymentType;
	Cohorts cohort;
	public DXC(int employeeId, int year, String employmentType, Cohorts cohort) {
		super();
		EmployeeId = employeeId;
		this.year = year;
		EmploymentType = employmentType;
		this.cohort = cohort;
	}
	public void display() {
		System.out.println("EmployeeId Year EmployeeType");
		 System.out.println(EmployeeId+"     "+year+"	"+EmploymentType);  
		 System.out.println(cohort.toString());  
	}

}
