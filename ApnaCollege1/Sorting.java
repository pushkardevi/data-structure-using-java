package ApnaCollege;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] arr1 = {7, 8, 3, 1, 2};

        // Bubble Sort TimeComplexity = O(n^2)
        for (int i = 0; i < arr1.length; i++) {

            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] > arr1[j]) {
                    // swap
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("BUBBLE SORT    -> " + Arrays.toString(arr1));

        // Selection Sort TimeComplexity = O(n^2)
        int[] arr2 = {7, 8, 3, 1, 2};
        for (int i = 0; i < arr2.length; i++) {
            int small = i;
            for (int j = i + 1; j < arr2.length; j++) {

                if (arr2[small] > arr2[j]) {
                    small = j;
                }
            }
            int temp = arr2[small];
            arr2[small] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("SELECTION SORT -> " + Arrays.toString(arr2));

        //Insertion Sort TimeComplexity = O(n^2)
        int[] arr3 = {7, 8, 3, 1, 2};

        for (int i = 1; i < arr3.length; i++) {
            int current = arr3[i];
            int j = i - 1;
            while (j >= 0 && current < arr3[j]) {
                arr3[j + 1] = arr3[j];
                j--;
            }
            arr3[j + 1] = current;
        }
        System.out.println("INSERTION SORT -> " + Arrays.toString(arr3));
    }
}
