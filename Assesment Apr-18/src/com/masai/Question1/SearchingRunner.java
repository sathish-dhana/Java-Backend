package com.masai.Question1;

public class SearchingRunner {
    public static void main(String[] args) {
        int[] arr={1,3,2}; //unsorted array
        int target=3;
        BinarySearch bs1=new BinarySearch(new BubbleSort());
        bs1.binarySearch(arr,target);
        BinarySearch bs2=new BinarySearch(new SelectionSort());
        bs2.binarySearch(arr,target);
        BinarySearch bs3=new BinarySearch(new MergeSort());
        bs3.binarySearch(arr,target);
    }
}
