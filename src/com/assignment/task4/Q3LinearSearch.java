package com.assignment.task4;
import java.util.*;
public class Q3LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Linear Search
        {
            int value = 45;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.println("index " + i);
                    break;
                }
            }
        }
    }
}

