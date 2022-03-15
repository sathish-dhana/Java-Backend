package com.masai.question2;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount dhanaAcc = new SavingAccount(101);


        dhanaAcc.deposit(1000);

        try{
            dhanaAcc.withdraw(2000);
            System.out.println("Amount withdrawn succesfully");
        } catch (InsufficientFundException ie){
            System.out.println(ie);
        }

    }
}
