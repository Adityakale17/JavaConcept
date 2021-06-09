package com.cyient.student;

public class StudentTest {

	public static void main(String[] args) {
		Student.schAdd="Global School";
		Student.schName="Global School";
		
		Student s1 = new Student();
		s1.rollno=1001;
		s1.studName="Jack";
		s1.studMail="jack@gmail.com";
		s1.studAdd="#23 egp";
		s1.percen=45;
		
		Student.StudentDetails(s1);
		
		System.out.println("---------------------------------------------------");
		Student s2 = new Student();
		s2.rollno=1002;
		s2.studName="Peter";
		s2.studMail="peter@gmail.com";
		s2.studAdd="#23 VNN";
		s2.percen=96;
		
		Student.StudentDetails(s2);
		
		System.out.println("---------------------------------------------------");
		
		Student s3 = new Student();
		s3.rollno=1003;
		s3.studName="Mark";
		s3.studMail="mark@gmail.com";
		s3.studAdd="#23 TT";
		s3.percen=89;
		
		Student.StudentDetails(s3);
		
		
	}

}
