package ApnaCollege;

public class Recursion11 {

    public static void main(String[] args) {

        int factorial = factorial(2);
        System.out.println(factorial);

    }

    private static int factorial(int n) {

        int fact = 1;
        if (n == 0) {
            return fact;
        }
        fact = factorial(n - 1);
        return fact * n;
    }

}
