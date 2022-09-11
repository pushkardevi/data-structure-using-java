package ApnaCollege;

public class Recursion8 {

    public static void main(String[] args) {

        String s1 = "abcd";
        reverse(s1, s1.length()-1);

    }

    private static void reverse(String str, int index) {


//        for (int i = s1.length() - 1; i >= 0; i--) {
//            rev.append(s1.charAt(i));
//        }
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverse(str, index - 1);
    }
}
