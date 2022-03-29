package com.masai.question1;

public class Students extends Address {
    private int roll;
    private String name;
    private Address address;
    private String email;
    private String password;

    public Students() {
    }

    public Students(int roll, String name, Address address, String email, String password) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Students{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
