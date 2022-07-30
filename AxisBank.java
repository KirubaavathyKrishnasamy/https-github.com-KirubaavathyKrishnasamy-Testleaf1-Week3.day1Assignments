package org.system;

public class AxisBank extends BankInfo {
public void deposit() 
{
	System.out.println("My deposit is done");
}
public static void main (String[] args)
{
	AxisBank mydeposit = new AxisBank();
	mydeposit.deposit();
	
			
}
}
