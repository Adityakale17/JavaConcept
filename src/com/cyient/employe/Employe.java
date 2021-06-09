package com.cyient.employe;

public class Employe {
	public int empNo;
	public String empName;
	public double empSal;
	public static String companyName;
	
	public static void printEmployeDetails(Employe e) {
		System.out.println("Employe number:"+e.empNo);
		System.out.println("Employe Name:"+e.empName);
		System.out.println("Employe Salary:"+e.empSal);
		System.out.println("Employe companyname:"+Employe.companyName);
	}

}
