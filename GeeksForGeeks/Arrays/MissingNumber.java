package GeeksForGeeks.Arrays;

public class MissingNumber {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int missing = MissingNumber(arr, 4);
        System.out.println("Missing Number: " + missing);

    }

    private static int MissingNumber(int array[], int n) {
        // Your Code Here
        int expectedLength = array.length + 1;
        int actualLength = array.length;
        int expectedSum = expectedLength * (expectedLength + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < actualLength; i++) {
            actualSum = actualSum + array[i];
        }

        int missingNum = expectedSum - actualSum;
        return missingNum;
    }
}
