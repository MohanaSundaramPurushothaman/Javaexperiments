package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain Project = new EmployeeMain();
		Project.run();
	}

	void run() {
		Employee employeestore[] = new Employee[4];
		Department devdepartment = new Department("Dev1", "Developing Dept");
		Department testingdepartment = new Department("Test1", "Testing Dept");

		Developer Dev_employee1 = new Developer(234, "Msp", devdepartment, "java");
		Developer Dev_employee2 = new Developer(567, "Ajay", devdepartment, "python");
		Tester Testing_employee1 = new Tester(798, "shivam", testingdepartment, "TestNG");
		Tester Testing_employee2 = new Tester(987, "Vijay", testingdepartment, "Junit");

		employeestore[0] = Dev_employee1;
		employeestore[1] = Dev_employee2;
		employeestore[2] = Testing_employee1;
		employeestore[3] = Testing_employee2;

		for (int j = 0; j < employeestore.length; j++) {
			Employee iteratedemployee = employeestore[j];
			boolean isadeveloper = iteratedemployee instanceof Developer;
			if (isadeveloper) {
				Developer Dev_employee = (Developer) iteratedemployee;
				displayDev_employeedetails(Dev_employee);

			}
			boolean isatester = iteratedemployee instanceof Tester;
			if (isatester) {
				Tester Testing_employee = (Tester) iteratedemployee;
				displayTesting_employeedetails(Testing_employee);
			}

		}
	}

	void displayemployeedetails(Employee employee) {
		int id = employee.getId();
		String name = employee.getName();
		Department department = employee.getDepartment();
		String deptid = department.getDeptid();
		String deptname = department.getDeptname();
		System.out.println("ID - " + id + " " + "Name - " + name);
		System.out.println("DeptId - " + deptid + " " + "DeptName - " + deptname);

	}

	void displayDev_employeedetails(Developer employee) {
		System.out.println("DEVELOPER");
		displayemployeedetails(employee);
		String Language = employee.getLanguage();
		System.out.println("Programming Language known - " + Language);
		System.out.println("---------------------------------------------------------");

	}

	void displayTesting_employeedetails(Tester employee) {
		System.out.println("TESTER");
		displayemployeedetails(employee);
		String tools = employee.getTools();
		System.out.println("Testingtools known - " + tools);
		System.out.println("---------------------------------------------------------");
	}
}
