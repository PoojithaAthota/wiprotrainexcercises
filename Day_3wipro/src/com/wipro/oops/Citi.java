package com.wipro.oops;

public class Citi implements BankOps {
	double balance = 0;

 public void deposit(double amount, String accNumber) {
     balance += amount + 10; 
     System.out.println("Citi: Deposited ₹" + amount + " with ₹10 bonus into account " + accNumber);
 }
 public double withdraw(double amount, String accNumber) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Citi: Withdrawn ₹" + amount + " from account " + accNumber);
         return amount;
     } else {
         System.out.println("Citi: Insufficient balance for account " + accNumber);
         return 0;
     }
 }
 public double getBalance() {
     return balance;
 }
}
