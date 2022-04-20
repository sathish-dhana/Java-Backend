package com.masai.Question2;

public class MyLinkedList extends MyArrayList{
    @Override
    public void add(int x, int y) {
        System.out.println("Added by myLinkedList class : " + (x+y));
    }
}
