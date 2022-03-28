package com.masai.question2;

import java.util.Objects;

public class Employee extends Address {
    private String empId;
    private String empName;
    private Address address;
    private String email;
    transient private String Password;

    public Employee(String empId, String empName, Address address, String email, String password) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.email = email;
        Password = password;
    }

    public Employee() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Employee\n" +
                "empId = " + empId + '\n' +
                "empName = " + empName + '\n' +
                "Address = " + address + '\n' +
                "email = " + email + '\n' +
                "Password = " + Password + '\n';
    }
}
