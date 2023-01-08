package com.assignment.task7;
import java.util.* ;
public class Q1FirstNonRepChar {
    public static void main(String[] args) {
        //First Non-Repeated Character
        {
            HashMap<Character, Integer> map = new HashMap<>();
            String str = "Repeating Characters";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            for (Iterator<Character> it = map.keySet().iterator(); it.hasNext(); ) {
                char c = it.next();
                System.out.println(c + " " + map.get(c));
            }
        }
    }
}
