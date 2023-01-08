package com.assignment.task4;
import java.util.*;
public class Q10ChkEqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Java program to check the equality of two arrays
        {
            int[] arr1 = { 0,1,2,3,4,5 };
            int[] arr2 = { 1,2,3,4,5,6 };
            boolean flag = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("The arrays are not equal");
                    return;
                }
            }
            System.out.println("The arrays are indeed Equal");
        }
    }
}