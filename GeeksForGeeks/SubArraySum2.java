package GeeksForGeeks;

public class SubArraySum2 {

    public static void main(String[] args) {
       int [] ans = twoSum();
    }

    private static int[] twoSum() {

        int[] nums = {3, 2, 3};
        int target = 6;


        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
            i++;
        }
        return ans;

    }
}
