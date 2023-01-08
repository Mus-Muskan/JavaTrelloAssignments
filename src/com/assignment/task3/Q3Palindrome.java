package com.assignment.task3;

public class Q3Palindrome {
    public static void main(String[] args) {

        //WAP to check palindrome
        int num = 3553, rev = 0, r;
        int n = num;
        while (num != 0) {
            r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        if (n == num) {
            System.out.println(n + " is Palindrome.");
        }
        else {
            System.out.println(n + " is not Palindrome.");
        }
    }
}
