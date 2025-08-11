package com.wipro.oops;


public class Hdfc implements BankOps {
	double balance = 0;

 public void deposit(double amount, String accNumber) {
     balance += amount;
     System.out.println("HDFC: Deposited ₹" + amount + " into account " + accNumber);
 }
 
 public double withdraw(double amount, String accNumber) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("HDFC: Withdrawn ₹" + amount + " from account " + accNumber);
         return amount;
     } else {
         System.out.println("HDFC: Insufficient balance for account " + accNumber);
         return 0;
     }
 }

 public double getBalance() {
     return balance;
 }
}
