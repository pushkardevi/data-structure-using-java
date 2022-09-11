package ApnaCollege;

public class Recursion2 {

    private static void sumOfNatural(int i, int n, int sum) {

        if (n == i) {
            sum = sum + i;
            System.out.print(sum);
            return;
        }

        sum = sum + i;
        sumOfNatural(i + 1, n,sum);

    }

    public static void main(String[] args) {
        sumOfNatural(1, 5,0);

    }
}
