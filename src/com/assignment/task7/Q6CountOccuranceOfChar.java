package com.assignment.task7;
import java.util.*;
public class Q6CountOccuranceOfChar {
    public static void main(String[] args) {
        //Program to count occurences of each character in a String
        {
            HashMap<Character,Integer> map = new HashMap<>();
            String str = "ConsultAdd Inc";
            int l=str.length();
            for (int i = 0; i < l; i++)
            {
                char c = str.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            System.out.println(Arrays.asList(map));
        }
    }
}
