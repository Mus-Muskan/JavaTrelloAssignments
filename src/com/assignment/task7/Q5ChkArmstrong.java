package com.assignment.task7;
import java.util.*;
public class Q5ChkArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum += r * r * r;
            num =num/10;
        }
        if (sum == n) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
