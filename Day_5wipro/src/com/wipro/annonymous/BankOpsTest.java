package com.wipro.annonymous;

public class BankOpsTest {


    public static void main(String[] args) {

        BankOps savings = new BankOps() {
            double balance = 0;

            @Override
            public void deposit(double amount) {
                balance += amount;
                System.out.println("Savings Account: Deposited ₹" + amount + ", Balance: ₹" + balance);
            }
        };

        BankOps current = new BankOps() {
            double balance = 0;

            @Override
            public void deposit(double amount) {
                balance += amount;
                System.out.println("Current Account: Deposited ₹" + amount + ", Balance: ₹" + balance);
            }
        };

        savings.deposit(1000);
        current.deposit(2000);
    }
}
