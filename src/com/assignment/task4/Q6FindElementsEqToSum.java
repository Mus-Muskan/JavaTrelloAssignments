package com.assignment.task4;
import java.util.*;
public class Q6FindElementsEqToSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Program to find the sum of the two elements of a given array
        //which is equal to a given integer
        {
            int array[] = {0, 1, 2, 3, 4, 5, 6};
            int target = 6;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("The sum of " + i + " and " + j + " is : 6");
                        break;
                    }
                }
            }
        }

    }
}
