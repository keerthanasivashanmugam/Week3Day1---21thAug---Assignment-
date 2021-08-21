package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student Name : Keerthana S");
	}
	public void studentDept()
	{
		System.out.println("Student Department : B.Tech");
	}
	public void studentId()
	{
		System.out.println("Student ID : 5120023");
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		System.out.println("Calling methods from College Package and College Class :");
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		System.out.println("\nCalling methods from Department Package and Department Class:");
		std.deptName();
		System.out.println("\nCalling methods from Student Package and Student Class:");
		std.studentId();
		std.studentName();
		std.studentDept();
		
	}
}
