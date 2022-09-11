package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        int n = strs.length;
        String pre = strs[0];
        for (int i = 1; i < n; i++) {
                while (!strs[i].startsWith(pre)) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        System.out.println(pre);
    }
}
