package com.assignment.task2;
import java.util.*;
public class Q4ChkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Program to check leap year
        int year = sc.nextInt();
        int flag = 0;

        if(year%400 == 0)
            flag =1;
        else if((year%4==0)&&(year%100!=0))
            flag=1;
        else
            System.out.println("It is not a leap year.");

        if(flag==1)
            System.out.println("It is a leap year. ");
    }
}
