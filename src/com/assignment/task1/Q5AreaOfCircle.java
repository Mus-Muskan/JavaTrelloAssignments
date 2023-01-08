package com.assignment.task1;
import java.util.*;
public class Q5AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Program to calculate area of a circle
        double radius, area ;
        System.out.print("Please enter the radius of the Circle : ");
        radius=sc.nextDouble();
        area= (3.14*radius*radius);
        System.out.println("The area of the circle is : " + area);

    }
}
