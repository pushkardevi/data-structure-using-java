package ApnaCollege;

public class Recursion5 {

    public static void main(String[] args) {
    int power = calcPower(2,3);
        System.out.println(power);


    }

    private static int calcPower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int value = calcPower(x, n - 1);
        return value * x;
    }

}
