package com.assignment.task7;

public class Q8MaxValueWithoutCollections {
    public static void main(String[] args) {
        //Maximum value in Array without using Collections
        {
            int[] arr = {15, 45, 13, 323, 3};
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
}
