package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] merged = new int[nums1.length+ nums2.length];

        for(int i= nums1.length, j=0; i< nums1.length+ nums2.length; i++,j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(merged));
    }

}
