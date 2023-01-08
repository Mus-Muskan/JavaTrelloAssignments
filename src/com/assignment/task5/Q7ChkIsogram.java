package com.assignment.task5;
import java.util.*;
public class Q7ChkIsogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //program that reverses the words of a sentence
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
