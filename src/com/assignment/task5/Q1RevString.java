package com.assignment.task5;
import java.util.*;
public class Q1RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //Program to reverse a string
        {
            System.out.print("Enter a string : ");
            String str = sc.next();
            String rev = "";
            for (i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);
        }
    }
}
