//Write a program to read employee name,wages and working days and calculate payment of employee.
import javax.swing.*;

class Employee_Payment
{
	public static void main(String args[])
	{
	String ename = JOptionPane.showInputDialog("Enter Employee Name: ");
	String ewage = JOptionPane.showInputDialog("Enter Employee Wages: ");
	int wage = Integer.parseInt(ewage);
	String ewd = JOptionPane.showInputDialog("Enter Employee Working Days:");
	int wd = Integer.parseInt(ewd);
	int epay = wage*wd ;
	System.out.print(ename+"'s Payment: Rs."+ epay);
	}
}