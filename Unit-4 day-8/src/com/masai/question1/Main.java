package com.masai.question1;

public class Main {
    public static void main(String[] args) {

        Animal[] animals;
        animals = new Animal[]{new Dog(), new Cat(), new Tiger()};

        for(int i = 0; i < animals.length; i++) {
            animals[i].makeNoise();
            animals[i].eat();
            animals[i].walk();
        }
    }
}
