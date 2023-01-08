package com.assignment.task7;

public class Q3ChkUniqueChar {
    public static void main(String[] args) {
        String str = "Hey! Hi! Hello!";
        getcombination(str, "");
    }

    public static void getcombination(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                getcombination(rem, prefix + str.charAt(i));
            }
        }
    }
}
