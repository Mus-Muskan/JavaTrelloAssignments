package com.assignment.task6;

public class Complex {
    double real , imaginery ;
    public Complex() {
        real = 0;
        imaginery = 0;
    }
    public Complex(double real, double imaginery)
    {
        this.real = real;
        this.imaginery = imaginery;
    }
    public Complex add(Complex complex)
    {
        double real = this.real + complex.real;
        double imaginery = this.imaginery + complex.imaginery;
        return new Complex(real, imaginery);
    }

    public Complex subtract(Complex complex)
    {
        double real = this.real - complex.real;
        double imaginery = this.imaginery - complex.imaginery;
        return new Complex(real, imaginery);
    }

    public Complex multiply(Complex complex)
    {
        double real = (this.real * complex.real) - (this.imaginery * complex.imaginery);
        double imaginery = (this.real * complex.imaginery) + (this.imaginery * complex.real);
        return new Complex(real, imaginery);
    }

    public String toString()
    {
        return real + " + " + imaginery + "i";
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 1);
        Complex complex2 = new Complex(2, 3);
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.subtract(complex2));
        System.out.println(complex1.multiply(complex2));
    }
}
