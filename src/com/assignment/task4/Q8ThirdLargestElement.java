package com.assignment.task4;
import java.util.*;
public class Q8ThirdLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Program to print 3rd largest
        {
            int n = arr.length;
            Arrays.sort(arr);
            int max3 = arr[2];
            System.out.println(max3);
        }

    }
}
