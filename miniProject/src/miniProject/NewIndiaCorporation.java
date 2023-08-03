package miniProject;

import java.util.Scanner;

public class NewIndiaCorporation {
	
	void SalaryCalculation(double basePay,double hour) {
		double salary;
		if(basePay>=50 && hour<=60) {
			
			if(hour>40) {
				double OT =hour-40;
				salary=(40*basePay)+(OT*(basePay*1.5));
				
			}else {
				salary=hour*basePay;
			}
			System.out.println(" Total salary of Employee is : "+salary);
		}else {
			System.out.println("Error! enter valid base pay and hour");
		}
		
	}
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		NewIndiaCorporation nic = new NewIndiaCorporation ();
		
		System.out.println("Enter base pay : ");
		double basePay=sc.nextDouble();
		System.out.println("Enter total hours of work : ");
		double hour=sc.nextDouble();
		
		nic.SalaryCalculation(basePay, hour);
		
		
	}
	

}
