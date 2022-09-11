package LeetCode;

public class searchInsert {

    public static void main(String[] args) {
        System.out.println(count());

        int sum = Integer.MIN_VALUE;


    }

    static int count() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;  // if target is found return the mid.
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;

    }

}
