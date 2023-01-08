package com.assignment.task6;

public class Triangle {

    public void area()
    {
        System.out.println("Area " + (0.5 * 3 * 4));
    }
    public void perimeter()
    {
        System.out.println("perimeter" + (3 + 4 + 5));
    }
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.area();
        tri.perimeter();
    }

}
