package com.masai.question2;

public class Main {
    public int[] findAndReturnPrimeNumbers(int[] inputArray) {
        int[] res = new int[inputArray.length];
        int pointer = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] % 2 == 0) {
                res[pointer++] = inputArray[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Main m1 = new Main();
        int[] arr = {10,12,5,50,11,14,15};

        int[] res = m1.findAndReturnPrimeNumbers(arr);

        if (res.length == 0) {
            System.out.println("Prime number not found in the supplied Array");
        } else {
            for (int x:res) {
                if (x != 0)
                    System.out.print(x +" ");
            }
        }
    }
}
