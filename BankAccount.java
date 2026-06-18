
// Simple Bank Account System using Encapsulation!


package org.Projecct;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double balance;
	
	//parameterized constructor
	public BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.balance = balance;
	}
	//login method
	public boolean login(int enteredPin) {
		return this.pin == enteredPin;
	}
	
	
	//check balance method
	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}
	
	//deposit method
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited Successfully");
			System.out.println("Updated Balance: " + balance);
			} else {
				System.out.println("Invalid Deposit Amount");
			}
	}
	
	//Withdraw Method 
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Withdrawal Amount");
		} else if(amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amount;
			System.out.println("Amount Withdrawn Successfully");
			System.out.println("Updated Balance: " + balance);
		}
	}
	
	
	//Display Account Details method
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
	}
		
}
		
		
		
		
		

		
		
	
