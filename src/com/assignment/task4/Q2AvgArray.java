package com.assignment.task4;
import java.util.*;
public class Q2AvgArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            //Program to calculate avg using array
            {
                int sum = 0;
                for ( i = 0; i < arr.length; i++) {
                    sum = sum + arr[i];
                }
                int l = arr.length;
                int avg = sum / l;
                System.out.println("The Average of the array is : " + avg);
            }
        }
    }
}
