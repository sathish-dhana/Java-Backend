package com.masai.question3;

public class Employee implements Comparable<Employee> {
    private int empID;
    private String name;
    private String adress;
    private Double salary;

    public Employee() {
    }

    public Employee(int empID, String name, String adress, Double salary) {
        this.empID = empID;
        this.name = name;
        this.adress = adress;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary < o.getSalary())
            return 1;
        else if (this.salary > o.getSalary())
            return -1;
        else
            return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empID + " " + name + " " + adress + " " + salary;
    }
}
