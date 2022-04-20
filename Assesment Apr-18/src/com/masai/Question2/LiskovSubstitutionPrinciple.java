package com.masai.Question2;

public class LiskovSubstitutionPrinciple {
    /*Liskov substitution principle states that the parent class object should be replacable with
    the child class objects without any error in the application.
     Advantages :-
     * this gives modularity to the objects like pieces of puzzle attached and removed.
     * makes our code reusable, because we can use the codes written in parent class.
     * this makes our application loosely coupled with one another.
     * it gives flexibility to our application.
     */
    public static void main(String[] args) {

        MyList list = new MyArrayList();
        list.add(2, 3);

        MyList list1 = new MyLinkedList();
        list1.add(2, 3);

        MyList name = new MyListWithoutDuplicate();


    }
}
