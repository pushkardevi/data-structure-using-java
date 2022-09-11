package ApnaCollege;

public class Recursion4 {

    public static void main(String[] args) {

        int fib = fib(5);
        System.out.println(fib);
    }

    private static int fib(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }


        int fib = fib(n - 1);
        return n + fib;

    }
}
