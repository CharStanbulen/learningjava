import java.io.*;
public class Employee1
{
/* basic
	public String name;
	private double salary;
	public Employee1(String empName) {
		name = empName;
	}
	public void setSalary(double empSal) {
		salary = empSal;
	}

	public void printEmp() {
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
	}

	public static void main(String[] args) {
		Employee1 empOne = new Employee1("wenliang");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
*/

	private static double salary;
	public static final String DEPARTMENT = "development ";
	public static void main(String[] args) {
		salary = 1000;
		System.out.println(DEPARTMENT + "average salary:" + salary);
	}
}
