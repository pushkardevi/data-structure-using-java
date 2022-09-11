package GeeksForGeeks.Arrays;

public class RemoveDuplicatesFromArray {

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr.length;

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length-1];
        j++;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
       int n = removeDuplicates(arr);
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
