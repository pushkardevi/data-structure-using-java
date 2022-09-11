package GeeksForGeeks.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesInArray {

    public static void main(String[] args) {

        //int[] arr1 = {2, 3, 1, 2, 3};
        int[] arr1 = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};

        //ArrayList<Integer> list = duplicates(arr1, 5);
        for (int i : duplicates(arr1)) {
            System.out.print(i + " --> ");
        }
    }

    public static int[] duplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        //Brute force
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            for (int j = i + 1; j < arr.length; j++) {
//
//                if (arr[i] == arr[j]) {
//                    list.add(arr[j]);
//                }
//            }
//        }

//        //Using Set Interface
//        Set<Integer> set = new HashSet<>();
//        for (int i : arr) {
//            if (!set.add(i) && !list.contains(i)) {
//                list.add(i);
//            }
//        }
//
//        if (list.size() == 0) {
//            list.add(-1);
//            return list;
//        }
//
//        Collections.sort(list);
//        return list;

        return Arrays.stream(arr).distinct().toArray();

    }

}
