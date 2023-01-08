package com.assignment.task7;
import java.util.* ;
public class Q2IntersectionOfArrays {
    public static void main(String[] args) {
        //Intersection of two arrays
        {
            int[] arr1 = {5, 23, 3, 4, 86,45,345,478,65};
            int[] arr2 = {8, 9, 3, 7, 678,34};
            int[] res = new int[10];
            int l1=arr1.length, l2=arr2.length;
            int m = 0;
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                    if (arr1[i] == arr2[j]) {
                        res[m] = arr1[i];
                        m++;
                    }
                }
            }
            for (int i :res) {
                System.out.println(i);
            }
        }
    }

}
