package LeetCode.String;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {
        int length = lengthOfLastWord("Hello Java");
        System.out.println(length);

    }

    private static int lengthOfLastWord(String s) {

        int length;
        String[] word = s.split(" ");

        length = word[word.length - 1].length();
        return length;

    }
}

