package com.masai.question1;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private double salary;

    public Employee() {
    }


    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary < o.getSalary())
            return 1;
        else if (this.salary > o.getSalary())
            return -1;
        else
            return 0;
    }


}
