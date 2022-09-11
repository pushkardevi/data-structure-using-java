package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInteger {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            int j = i + 1;
            if (j >= nums.length) {
                break;
            }
            if (nums[i] == nums[j]) {
                count++;
                set.add(nums[i]);
            }
        }
        System.out.println(count);
        System.out.println("New Array");
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}