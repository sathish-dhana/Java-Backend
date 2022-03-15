package com.masai.question2;

public class SavingAccount {
    int accountNumber;
    double balance;

    public SavingAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public double withdraw(int amount) throws InsufficientFundException{
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient Amount in the Account");
        } else {
            balance -= amount;
        }
        return amount;
    }

}
