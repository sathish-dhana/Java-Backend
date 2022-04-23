package com.masai.CreationalPatterns;

public class AbstractFactoryFactoryPattern {
   /* Abstract Factory Pattern says that just define an interface or abstract class for creating families
    of related (or dependent) objects but without specifying their concrete sub-classes.
    That means Abstract Factory lets a class returns a factory of classes.
    So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.*/

//    usage
//    When the system needs to be independent of how its object are created, composed, and represented.
}
interface Bank{
    String getBankName();
}
class HDFC implements Bank{
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
class ICICI implements Bank{
    private final String BNAME;
    ICICI(){
        BNAME="ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
abstract class Loan{
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years)
    {
            /*
                  to calculate the monthly loan payment i.e. EMI

                  rate=annual interest rate/12*100;
                  n=number of monthly installments;
                  1year=12 months.
                  so, n=years*12;
                */
        double EMI;
        int n;

        n=years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");
    }
}
class HomeLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}
class BussinessLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}
abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }
    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        }
        return null;
    }
}
class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
class AbstractFactoryPatternExample {
    public static void main(String args[]) {

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank("HDFC");

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan("home");
        l.getInterestRate(1.2);
        l.calculateLoanPayment(10000,1);
    }
}