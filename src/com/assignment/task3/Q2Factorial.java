package com.assignment.task3;

public class Q2Factorial {
    public static void main(String[] args) {
        //WAP to calculate factorial
        int j,f=1;
        int n=5;
        for(j=1;j<=n;j++){
            f=f*j;
        }
        System.out.println(" The Factorial of "+n+" is : "+f);
    }
}
