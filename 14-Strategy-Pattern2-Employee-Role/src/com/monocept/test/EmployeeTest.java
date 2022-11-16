package com.monocept.test;

import com.monocept.model.Consultant;
import com.monocept.model.Employee;
import com.monocept.model.IRole;
import com.monocept.model.SeniorConsltant;
import com.monocept.model.TechLead;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee(101, "Akhil", (new Consultant()));
		System.out.println(employee.getDescription());
		System.out.println(employee.getResponsibility());

		System.out.println("-----------------");
		employee = new Employee(111, "Raman", (new TechLead()));
		System.out.println(employee.getDescription());
		System.out.println(employee.getResponsibility());
		System.out.println("-----------------");
		employee = new Employee(112, "Sweta", (new SeniorConsltant()));
		System.out.println(employee.getDescription());
		System.out.println(employee.getResponsibility());
	}

}
