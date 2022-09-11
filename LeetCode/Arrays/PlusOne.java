package LeetCode.Arrays;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {4, 3, 2, 9};
        int[] arr = plusOne(digits);

        System.out.print(Arrays.toString(arr));
    }

    private static int[] plusOne(int[] digits) {

        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }
            else digits[i]=0;
        }
        int[] newarr = new int[digits.length+1];
        newarr[0]=1;
        return newarr;
    }

}
