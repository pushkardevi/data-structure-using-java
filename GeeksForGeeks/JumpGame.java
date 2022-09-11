package GeeksForGeeks;

public class JumpGame {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println("ANS:- " + jumps(arr));
    }
    static int jumps(int[] arr) {
        int jump = 0;
        int pos = 0;
        int des = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            des = Math.max(des, arr[i] + 1);
            if (pos == i) {
                pos = des;
                jump++;
            }
        }

        return jump;
    }


}
