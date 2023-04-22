package home.aggarwal.practice;

//Employee Class 
public class Employee {

	private int empId; // variable names should be camelCased

	private String empName;

	private String empAddress;

	private double empSalary;

	public void setDetails(int id, String name, String address, double salary) {
		empId = id;
		empName = name;
		empAddress = address;
		empSalary = salary;
	}

	public String getName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

}
