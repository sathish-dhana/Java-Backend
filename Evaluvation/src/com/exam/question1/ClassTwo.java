package com.exam.question1;

public class ClassTwo extends ClassOne {

    @Override
    public void methodOne(){
        System.out.println("Inside methodOne of ClassTwo");
    }
    @Override
    public void methodTwo(){
        System.out.println("Inside methodTwo of ClassTwo");
    }

    @Override
    public String toString(){
        return "This is ClassTwo object";
    }
}
