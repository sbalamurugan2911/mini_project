package miniProject;

import java.util.Scanner;

public class ElectronicShop {
	
	String name, phoneNo;
	int quantity;
    double price[]; // price array for user buy more than one laptop
    
    // constructor for initialize instance variable
	ElectronicShop(String name, String phoneNo, int quantity,double price[]) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.quantity = quantity;
		this.price=price;
	}

	
    // method for calculate discounted amount
	 static double calculateDiscount(double price) {
		double discountedAmount = 0; //local variable to store discounted amount
		if (price > 100000) {       // 15% discount if price more than 100000 
			discountedAmount = price - (price * 0.15);
		} else if (price > 50000) { // 10% discount if price more than 50000 
			discountedAmount = price - (price * 0.1);
		} else if (price > 25000) { // 7.5% discount if price more than 25000 
			discountedAmount = price - (price * 0.075);
		} else if (price > 0) {     // 5% discount if price upto 25000
			discountedAmount = price - (price * 0.05);
		}

		return discountedAmount;
	}
	 
    void bill() {
    	double bill=0,amount;// local variable to calculate total bill amount
    	System.out.println("------------------------ Bill ----------------------------------\nbala");
    	System.out.println("Customer Name          : "+name);
    	System.out.println("No of Laptop purchased : "+quantity+"\n");
    	for(int i=0;i<price.length;i++) {
    	System.out.println("Laptop "+(i+1)+" price is : "+price[i]);
    	}
    	System.out.println("\nPrice after discount : \n");
    	// using calculateDiscount method to find price after discount for each laptop
    	for(int i=0;i<price.length;i++) {
    	System.out.println("Laptop "+(i+1)+" price is : "+(amount=(ElectronicShop.calculateDiscount(price[i]))));
    	bill+=amount;
    	}
    	System.out.println("\nTotal bill amount is : "+bill);
    }

	public static void main(String[] args) {
		// create object for scanner class
	    Scanner sc = new Scanner(System.in);
	    // get input from users
		System.out.println("Enter customer name: ");
		String name = sc.next();
		System.out.println("Enter mobile number: ");
		String phoneNo = sc.next();
		System.out.println("No of laptop; ");
		int quantity = sc.nextInt();
		// create array for get more than one laptop price with size of quantity given by user
		double price[]=new double[quantity];
		// assign price amount given by user in array element
		for(int i=0;i<quantity;i++) {
		System.out.println("Enter laptop "+(i+1)+" price");
		price[i]=sc.nextDouble();
		}
		// create object for class electronic shop
		ElectronicShop shop = new ElectronicShop(name,phoneNo,quantity,price);
		// invoke bill method using shop object 
		shop.bill();
		
	}
}
