package org.Projecct;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//create bank account object
		BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);
		
		
		//login
		System.out.println("Enter PIN: ");
		int enteredPin = sc.nextInt();

		if(!account.login(enteredPin)) {
			System.out.println("Invalid PIN");
			return;
		}
		System.out.println("Login Successful");
		
		int choice;
		do {
			System.out.println("\n*******BANK MENU*******");
			System.out.println("1.Check Balance: ");
			System.out.println("2.Deposit Amount: ");
			System.out.println("3.Withdraw Amount: ");
			System.out.println("4.Display Account Details: ");
			System.out.println("5.Exit");
			
			
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				account.checkBalance();
				break;
			case 2:
				 System.out.println("Enter Deposit amount: ");
				 double depositAmount = sc.nextDouble();
				 account.deposit(depositAmount);
				 break;
			case 3:
				System.out.println("Enter withdrwal amount: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 4:
				account.displayAccountDetails();
				break;
			case 5:
				System.out.println("Thank You for using the Bank Appication");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 5);
		sc.close();
			
	}
		

}


