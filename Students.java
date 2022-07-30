package org.student;

public class Students {
public void getStudentInfo(String id)
{
	System.out.println("Student id is: " +id);;
}
public void getStudentInfo(String id, String name)
	{
	
	System.out.println("Student id is :" + id);
	System.out.println("Studentname name is :" +name);
		
	}
public void getStudentInfo(String emailid, int phonenumber)
{
System.out.println("Student email id is:" + emailid);
System.out.println("Student phone number is :" + phonenumber );
	
}



public static void main (String[] args)
{
Students details = new Students();
details.getStudentInfo("IT008");
details.getStudentInfo("IT008", "Kiruba");
details.getStudentInfo("cbe.kiruba93@gmail.com", 123456);


}
}

