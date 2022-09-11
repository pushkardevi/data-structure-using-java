package GeeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySumHashmap {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 7, 5};

        ArrayList<Integer> list = subarraySum(A, 5, 12);
        list.forEach(System.out::println);
    }

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {  //ArrayList<Integer>
        // Your code
        n = arr.length;
        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            if (currSum - s == 0) {
                list.add(1);
                list.add(i+1);
                break;
            } else if (map.containsKey(currSum - s)) {
                list.add(map.get(currSum - s) + 2);
                list.add(i+1);
                break;
            }
            map.put(currSum, i);
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}
