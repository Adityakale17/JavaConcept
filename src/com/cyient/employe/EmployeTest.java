package com.cyient.employe;

public class EmployeTest {

	public static void main(String[] args) {
		
		Employe.companyName="cyient";
		Employe emp1 = new Employe();
		emp1.empNo=101;
		emp1.empName="John";
		emp1.empSal=5000;
		
		Employe.printEmployeDetails(emp1);
		System.out.println("------------------------------------------");
		Employe emp2 = new Employe();
		emp2.empNo=102;
		emp2.empName="Tom";
		emp2.empSal=5500;
		Employe.printEmployeDetails(emp2);


	}

}
