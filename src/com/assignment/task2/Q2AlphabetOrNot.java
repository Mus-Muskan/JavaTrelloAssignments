package com.assignment.task2;
import java.util.*;
public class Q2AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program to check if a character is an alphabet or not
        int ch=sc.next().charAt(0);
        if(((ch>64) && (ch<92))  && ( (ch>96) && (ch<123)))
            System.out.println(" It is an alphabet. ");
        else
            System.out.println("It is not an alphabet. ");

    }
}
