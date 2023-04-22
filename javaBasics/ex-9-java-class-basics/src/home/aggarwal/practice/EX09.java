package home.aggarwal.practice;

public class EX09 {
	public static void main(String[] args) {

		// Creating Object of Class

		// OPTION 1:

		Employee emp = new Employee(); // Here, "emp" is Object of Employee Class;

		// OPTION 2:

		Employee em; // Variable of Employee Class

		em = new Employee(); // Object Creation and now em is an object of Employee Class;

//		Static Function: If You have set of Functions that you repeatedly use in your program, make them static.
//		Then we can invoke them anywhere without a need to instantiate the object by just using their class name.

//		Here, We have Created Common.java Class for Static Functions;
		int id = Common.getNumber("Enter the ID");

		String name = Common.prompt("Enter Name");

		String address = Common.prompt("Enter Address");

		double salary = Common.getDouble("Enter Salary ");

		emp.setDetails(id, name, address, salary);

		Common.print(String.format("The Name is %s from %s with the salary of %f", emp.getName(), emp.getEmpAddress(),
				emp.getEmpSalary()));
	}
}
