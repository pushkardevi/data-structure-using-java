package ApnaCollege;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " --> ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
}
