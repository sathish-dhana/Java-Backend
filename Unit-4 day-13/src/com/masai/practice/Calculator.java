package com.masai.practice;

@FunctionalInterface
public interface Calculator {
    public void calculate(int x, int y);
}

class Main{

    public static Calculator add() {
        return (x, y) -> System.out.println(x+y);
    }

        public static void main(String[] args) {

//        Calculator minus = (x, y) -> x - y;
//        Calculator plus = (x, y) -> x + y;
//        System.out.println(minus.calculate(5, 3));
//        System.out.println(plus.calculate(9, 10));

        Calculator cal = add();
        cal.calculate(4, 5);
    }
}