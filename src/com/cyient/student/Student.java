package com.cyient.student;

public class Student {
	
public int rollno;
public String studName;
public String studMail;
public String studAdd;
public static String schAdd;
public static String schName;
public int percen;

public static void StudentDetails(Student s)
{
	System.out.println("Roll no:-"+s.rollno);
	System.out.println("StudentName:-"+s.studName);
	System.out.println("Student Mail:-"+s.studMail);
	System.out.println("Student Address:-"+s.studAdd);
	System.out.println("School Address:-"+Student.schAdd);
	System.out.println("School Name:-"+Student.schName);
}

}
