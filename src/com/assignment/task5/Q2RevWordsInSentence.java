package com.assignment.task5;
import java.util.*;
public class Q2RevWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //Program to reverse a string keeping words seperate
        {
            System.out.print("Enter a sentence : ");
            String str = sc.nextLine();
            String revSen = "";
            for (i = str.length() - 1; i >= 0; i--) {
                revSen = revSen + str.charAt(i);
            }
            System.out.println(revSen);
        }
    }
}
