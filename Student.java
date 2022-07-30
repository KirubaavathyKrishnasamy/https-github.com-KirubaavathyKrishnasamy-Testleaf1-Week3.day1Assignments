package org.student;

import org.department.Department;

public class Student extends Department{
public  void StudentName()
{
	System.out.println("Kiruba");
	
}
public void Studentdepart()
{
	System.out.println("BCA");
	
}
public void StudentID()
{
	System.out.println("IT008"); 
	
}
public static void main (String[] args) {
	Student mydetails = new Student();
	mydetails.collegeName();
	mydetails.collegeCode();
	mydetails.collegeRank();
	
	mydetails.deptName();
	
	mydetails.Studentdepart();
	mydetails.StudentID();
	mydetails.StudentName();
	
}
}
