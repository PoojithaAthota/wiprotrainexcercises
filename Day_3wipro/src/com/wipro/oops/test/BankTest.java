package com.wipro.oops.test;

import com.wipro.oops.BankOps;
import com.wipro.oops.Hdfc;
import com.wipro.oops.Citi;

public class BankTest {
    public static void main(String[] args) {
        BankOps hdfc = new Hdfc();
        BankOps citi = new Citi();

        hdfc.deposit(1000, "HDFC001");
        hdfc.withdraw(400, "HDFC001");
        System.out.println("HDFC Balance: ₹" + hdfc.getBalance());

        citi.deposit(1000, "CITI001");
        citi.withdraw(500, "CITI001");
        System.out.println("Citi Balance: ₹" + citi.getBalance());
    }
}
