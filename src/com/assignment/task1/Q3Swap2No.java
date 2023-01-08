package com.assignment.task1;

public class Q3Swap2No {
    public static void main(String[] args) {
        // Program to swap using 3rd variable
        int a, b, temp;
        a=15; b=25;
        System.out.println("Before Swapping: a=" + a +" , b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: a=" + a +" , b="+b);


        // Program to swap without using 3rd variable
        int c, d;
        c=15; d=25;
        System.out.println("Before Swapping: c=" + c +" , d="+d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("After Swapping: c=" + c +" , d="+d);
    }
}
