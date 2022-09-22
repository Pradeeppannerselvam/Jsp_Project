package com.JSP_Project.Entity;

public class Employee {
	
	private int id;
	private String empName;
	private String empAddress;
	private String empContactNo;
	private int Age;
	private Double salary;
	private Double bonus;
	private String leave;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpContactNo() {
		return empContactNo;
	}
	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getBonus() {
		return bonus;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	public String getLeave() {
		return leave;
	}
	public void setLeave(String leave) {
		this.leave = leave;
	}
	public Employee(int id, String empName, String empAddress, String empContactNo, int age, Double salary, Double bonus,
			String leave) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empContactNo = empContactNo;
		Age = age;
		this.salary = salary;
		this.bonus = bonus;
		this.leave = leave;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", empName=" + empName + ", empAddress=" + empAddress + ", empContactNo="
				+ empContactNo + ", Age=" + Age + ", salary=" + salary + ", bonus=" + bonus + ", leave=" + leave + "]";
	}
	
}