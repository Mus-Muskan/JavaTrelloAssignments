package com.assignment.task2;
import java.sql.SQLOutput;
import java.util.*;
public class Q1PosNeg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Program to check if a number is +ve or -ve
        System.out.print("Enter the number to be checked : ");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("The no is Positive");
        else if(n<0)
            System.out.println("The number is negative");
        else
            System.out.println("You entered 0.");

    }
}