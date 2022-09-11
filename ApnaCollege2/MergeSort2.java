package ApnaCollege2;

import java.util.Arrays;

public class MergeSort2 {


    public static void main(String[] args) {

        int[] input = {6, 3, 9, 5, 2, 8};
        divide(input, 0, input.length-1);
        System.out.print(Arrays.toString(input));
    }


    private static void divide(int[] arr, int start, int end) {

        if (start == end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int length = end - start +1;
        System.out.println(length);
        int[] merged = new int[length];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        for(int p=0 ,q=start;p<merged.length;p++,q++){
            arr[q] = merged[p];
        }
    }
}
