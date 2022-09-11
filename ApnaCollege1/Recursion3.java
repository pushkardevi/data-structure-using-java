package ApnaCollege;

public class Recursion3 {

    public static void main(String[] args) {
        int fact = fact(5);
        System.out.println(fact);
    }

    private static int fact(int n) {
//        for (int i = 1; i <= n; i++) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int fact = fact(n - 1);
        //}
        return n * fact;
    }
}
