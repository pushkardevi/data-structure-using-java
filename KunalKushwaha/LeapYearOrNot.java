package KunalKushwaha;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) throws Exception {

            int year;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Year to check whether it's leap or not: ");
                year = sc.nextInt();
                if (year % 4 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } while (year != 0);
            System.out.println("Exiting...");
        }
}
