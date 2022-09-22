package com.JSP_Project.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.JSP_Project.Entity.Employee;

public class EmployeeService {
	
	public List<Employee> getEmployeDetailsEmployees(){
	 List<Employee> emplist = new ArrayList();
	 Employee emp1 = new Employee(01, "Pradeep P", "Aranthangi", "9999089899", 24, 24000.00, 10000.00, "20 Days");
	 Employee emp2 = new Employee(02, "Salman S", "Aranthabgi", "9876543210", 23, 25000.00, 10000.00, "10 Days");
	 Employee emp3 = new Employee(03, "Parthi", "chennai", "9999089891", 24, 26000.00, 10000.00, "20 Days");
	 emplist.addAll(Arrays.asList(emp1,emp2,emp3));
	 return emplist;
	}
	
	
}