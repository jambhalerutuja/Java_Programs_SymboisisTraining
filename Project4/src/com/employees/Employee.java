package com.employees;

public class Employee {
	private int emp_id;
	private String name;
	private int salary;
	
	public void setEmpId(int emp_id) {
		this.emp_id=emp_id;
		
	}

	public int getEmpId() {
		return emp_id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary ) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setName("Rutuja");
		emp.setSalary(70000);
//		System.out.println(emp.getEmpId());
//		System.out.println(emp.getName());
//		System.out.println(emp.getSalary());
		System.out.println(emp);

	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + "]";
	}

}
