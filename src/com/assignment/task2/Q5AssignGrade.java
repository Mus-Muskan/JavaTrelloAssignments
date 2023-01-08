package com.assignment.task2;
import java.util.*;
public class Q5AssignGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Program to assign the grade
        char grade ;
        int  marks = sc.nextInt();
        if(marks > 98)
            grade = 'A';
        else if (marks > 75)
            grade ='B';
        else if (marks > 65)
            grade ='C';
        else
            grade ='D';
        System.out.println(" The grade is : " + grade);
    }
}
