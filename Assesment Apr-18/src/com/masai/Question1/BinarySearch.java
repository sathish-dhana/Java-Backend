package com.masai.Question1;

public class BinarySearch {
    Sort sortArray;

    public BinarySearch(Sort sort) {
        this.sortArray = sort;
    }

    public int binarySearch(int[] arr,int target){
        sortArray.sort(arr);
        return -1;
    }
}
