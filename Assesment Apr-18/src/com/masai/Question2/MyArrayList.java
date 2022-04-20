package com.masai.Question2;

public class MyArrayList extends MyList{
    @Override
    public void add(int x, int y) {
        System.out.println("Added by MyArrayList class : " + (x+y));
    }
}
