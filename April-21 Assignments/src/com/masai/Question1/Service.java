package com.masai.Question1;

public interface Service {
    public void service();
}

class CleanRoom implements Service {

    @Override
    public void service() {
        System.out.println("Room cleaned");
    }
}

class Products implements Service {
    @Override
    public void service() {
        System.out.println("provided products");
    }
}

class Food implements Service {

    @Override
    public void service() {
        System.out.println("provided foods");
    }
}