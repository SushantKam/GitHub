
import javax.swing.*;

class GST_Deduction
{
	public static void main(String args[])
	{
		String ename = JOptionPane.showInputDialog("Enter Employee Name: ");
		String ewage = JOptionPane.showInputDialog("Enter Employee Wages: ");
		double wage = double.parseDouble(ewage);
		String ewd = JOptionPane.showInputDialog("Enter Employee Working Days:");
		double wd = double.parseDouble(ewd);
		double epay = wage*wd ;
		double gst;
		if(epay > 25000)
		{
			gst = epay * 18 / 100;
			epay = epay - gst ;
			System.out.println("GST for Employee's payment: "+gst);
			System.out.println("Payment of Employee: "+epay);
		}
		else
		System.out.println("Payment of Employee: "+epay);

	} 
	
}