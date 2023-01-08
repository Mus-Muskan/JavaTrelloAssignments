package com.assignment.task4;
import java.util.*;
public class Q4BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Binary Search;
        {
            System.out.println("Enter the number to be search");
            int target = sc.nextInt();
            int beg = 0;
            int end = arr.length - 1;
            while (beg <= end)
            {
                int mid = (beg + end) / 2;
                if (arr[mid] == target) {
                    System.out.println(mid);
                    return;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
            }
        }

    }
}
