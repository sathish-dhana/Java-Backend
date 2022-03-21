package com.masai.question2;

import com.masai.question3.Employee;

public class Main {
    // question 1 //
    // both checked & unchecked occurs only at Runtime//
    /* checked exception is where confirm error will occur & we need to provide try catch block
    before compiling & this type of error will be caught while compiling
     For example : class Not found error */
    /* unchecked exception is where error may or may not occur & we need to handle
    exception based on logic
    & this type of error will not be caught while compiling
     For example : Arithmatic error, outofBound error */

    // question 2 //
    //throw is used when we want to throw error explicitly based on business logic//
    /*throws is used to warn caller of that method to
    handle the exception thrown from current method*/

    //question 3 //
    //final is used for class variable that are meant to be constant for example: pie or sigma value//
    /*finally is provided in try catch block at last to execute
    no matter what happens, it always runs except like System.out & errors like memory error
    */
    public static void main(String[] args) throws UnderAge {
        int age = 17;
        if (age > 18) {
            System.out.println("you are elligible");
        } else throw new UnderAge("this is checked exception");

        try {
            int b = 18/0;
        } catch (ArithmeticException ae) {
            System.out.println("this is unchecked exception");
        }


    }
}
