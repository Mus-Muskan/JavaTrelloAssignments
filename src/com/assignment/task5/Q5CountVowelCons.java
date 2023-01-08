package com.assignment.task5;
import java.util.*;
public class Q5CountVowelCons {
    Scanner sc = new Scanner(System.in);
    int i;
    //Program to count no of vowels and consonents
    {
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int vow = 0;
        int con = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {
                vow++;
            } else {
                con++;
            }
        }
        System.out.println("Vowels" + vow+ " Consonants " + con);
    }
}
