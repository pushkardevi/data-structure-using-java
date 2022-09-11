package LeetCode;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int val = 1;
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
