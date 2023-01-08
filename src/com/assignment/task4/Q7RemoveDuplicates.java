package com.assignment.task4;
import java.util.*;
public class Q7RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Program to remove duplicates from sorted array
        {
            int[] arr1 = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
            int l1 = arr.length;
            int[] arr2 = new int[l1];
            int l2 = arr2.length;
            int j = 0;
            int count = 0;
            for (int i = 0; i < l1 - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr2[j] = arr[i];
                    j++;
                } else {
                    count++;
                }
            }
            arr2[j] = arr[l1 - 1];
            for (int i = 0; i < l2 - count; i++) {
                System.out.print(arr2[i] + " ");
            }
            for (int i = 0; i < count; i++) {
                System.out.print("0 ");
            }
        }

    }
}