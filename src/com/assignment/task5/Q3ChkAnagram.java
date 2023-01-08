package com.assignment.task5;
import java.util.*;
public class Q3ChkAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //Program to check if the 2 strings are anagrams
        {
            String str1 = "listen";
            String str2 = "silent";
            boolean flag = true;
            if (str1.length() != str2.length()) {
                System.out.println("Not Anagram");
                return;
            }
            for ( i = 0; i < str1.length(); i++) {
                if (!str2.contains(String.valueOf(str1.charAt(i))))
                {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("The two strings are Anagrams of each other");
            } else {
                System.out.println("The two strings are not Anagram");
            }
        }

    }
}
