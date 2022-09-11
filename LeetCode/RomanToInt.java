package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

        String s = "MCMXCIV";

        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int number = 0;
        for (int i = 0; i <= s.length()-1; i++) {
            if (i + 1 == s.length() || values.get(s.charAt(i)) >= values.get(s.charAt(i + 1))) {
                number = number + values.get(s.charAt(i));
            } else {
                number = number - values.get(s.charAt(i));
            }

        }
        System.out.println("Number: " + number);
    }

}
