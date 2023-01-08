package com.assignment.task2;
import java.util.*;
public class Q6CreateCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program to create calculator using Switch
        char c;
        double n1, n2, result;
        System.out.println("Choose an operator: +, -, *, or /");
        c = sc.next().charAt(0);

        System.out.println("Enter first number");
        n1 = sc.nextDouble();

        System.out.println("Enter second number");
        n2 = sc.nextDouble();

        switch (c) {

            // performs addition between numbers
            case '+':
                result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
