package ApnaCollege;

public class Recursion6 {

    public static void main(String[] args) {
        int power = calcPower(2, 3);
        System.out.println(power);


    }

    private static int calcPower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

}
