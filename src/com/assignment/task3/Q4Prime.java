package com.assignment.task3;

public class Q4Prime {
    public static void main(String[] args) {
        //WAP to check prime

        int pnum = 29;
        boolean flag = false;
        for (int k = 2; k <= pnum / 2; k++)
        {
            if (pnum % k == 0)
            {
                flag = true;
            }
        }

        if (flag)
            System.out.println(pnum + " is not a prime number.");
        else
            System.out.println(pnum + " is a prime number.");
    }
}
