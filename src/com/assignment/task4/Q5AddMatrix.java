package com.assignment.task4;
import java.util.*;
public class Q5AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Program to add 2 matrices
        {
            int[][] m1 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
            int[][] m2 = {{19, 18, 17}, {16, 15, 14}, {13, 12, 11}};
            int ans[][] = new int[3][3];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[i].length; j++) {
                    ans[i][j] = m1[i][j] + m2[i][j];
                }
            }
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
