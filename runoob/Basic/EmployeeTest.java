import java.io.*;

public class EmployeeTest{
	public static void main(String []args) {
		Employee empOne = new Employee("wenliang1");
		empOne.empAge(26);
		empOne.empDesignation("coder");
		empOne.empSalary(1000);
		empOne.printEmployee();

		Employee empTwo = new Employee("wenliang2");
		empTwo.empAge(21);
		empTwo.empDesignation("senior coder");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}
