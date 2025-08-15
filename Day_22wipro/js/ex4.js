class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    deposit(amount) {
        this.balance += amount;
        console.log(`Deposited ₹${amount}. New balance: ₹${this.balance}`);
    }

    withdraw(amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            console.log(`Withdrew ₹${amount}. New balance: ₹${this.balance}`);
        } else {
            console.log("Insufficient balance!");
        }
    }
}

const myAccount = new BankAccount("6732971", 5000);
console.log(`Account Created: ${myAccount.accountNumber}, Balance: ₹${myAccount.balance}`);

myAccount.deposit(1500);
myAccount.withdraw(200);
myAccount.withdraw(600); 
