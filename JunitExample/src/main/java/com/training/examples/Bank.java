package com.training.examples;

public class Bank {
	
	double balance;

	

	public Bank(double balance) {
		super();
		this.balance = balance;
	}



	public double withdraw(double amount) throws ExceedingException {
		if(amount>=4000||amount>balance) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0) {
			throw new NegValueException("amount cannot be negative");
		}
		
			
			
		balance = balance - amount;
		return balance;
	}
	
	public double deposit(double amount) throws ExceedingException{
		if(amount<=0) {
			throw new NegValueException("amount cannot be negative");
		}
		if(amount>6000) {
			throw new ExceedingException("amount beyond limit of deposit");
		}
		balance = balance + amount;
		return balance;
	}
	public double average(int a, int b, int c) {
		if(a<0||b<0||c<0) {
			throw new NegValueException("inputs cannot be negative");
		}
		if(a>100||b>100||c>100) {
			throw new ExceedingException("values cannot be greater than 100");
		}

		return (a+b+c)/3;
		
	}

}
