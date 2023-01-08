package com.assignment.task5;
import java.util.*;
public class Q4CountOccuranceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //Program to count occurence of a given character
        {
            System.out.println("Enter the String");
            String str = sc.nextLine();
            System.out.print("Enter the character which needs to be checked : ");
            char ch = sc.next().charAt(0);
            int count = 0;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            System.out.println("The character :  "+ch+ "occurs" + count + "times. ");
        }
    }
}
