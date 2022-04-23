package com.masai.CreationalPatterns;

public class PrototypePattern {
   /* Prototype Pattern says that cloning of an existing object instead of creating new one
    and can also be customized as per the requirement. */

//    usage
//    * When the cost of creating an object is expensive or complicated.
//    * When you want to keep the number of classes in an application minimum.
//    * when we want to customize object.
}

interface Prototype {
    public Prototype getClone();
}

class Employee implements Prototype {
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public  Employee(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
    }

    @Override
    public Prototype getClone() {
        return new Employee(id,name,designation,salary,address);
    }
}