package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class SubarraySum {

    public static void main(String[] args) {
        //int[] A = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        int[] A = {3,2,4};
        ArrayList<Integer> list = subarraySum(A, 3, 6);
        list.forEach(System.out::println);
    }

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {  //ArrayList<Integer>
        // Your code
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int index = 0;
        n = arr.length;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            while (sum > s) {
                sum = sum - arr[index];
                index++;
            }
            if (sum == s) {
                list.add(index + 1);
                list.add(i + 1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
