package com.assignment.task5;
import java.util.*;
public class Q6ChkIfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //Program to check if string contains a substring
        {
            String string = "Hello! How are you ?";
            String subString = "are";
            boolean flag = true;
            int ls=string.length();
            int lsb=subString.length();
            if (ls < lsb) {
                System.out.println("false");
                return;
            }
            for (i = 0; i < ls - lsb + 1; i++) {
                for (int j = 0; j < lsb; j++) {
                    if (string.charAt(i + j) != subString.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("true");
                    return;
                }
            }
            System.out.println("false");
        }

    }
}
