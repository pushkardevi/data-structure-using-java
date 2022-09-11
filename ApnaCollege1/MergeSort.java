package ApnaCollege;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        divide(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i+" --> ");
        }

    }

    private static void conquer(int[] arr, int start, int mid, int end) {

        int[] merged = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        while (j <= end) {
            merged[k++] = arr[j++];
        }

        for (int idx1 = 0, idx2 = start; idx1 < merged.length; idx1++, idx2++) {
            arr[idx2] = merged[idx1];
        }

    }

    private static void divide(int[] arr, int start, int end) {

        if (start == end) {
            return;
        }

        int mid = start + (end - start) / 2;

        //Divide Left
        divide(arr, start, mid);

        //Divide Right
        divide(arr, mid + 1, end);

        conquer(arr, start, mid, end);

    }
}
