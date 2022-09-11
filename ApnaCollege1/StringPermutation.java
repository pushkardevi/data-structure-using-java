package ApnaCollege;

public class StringPermutation {

    public static void main(String[] args) {

        printPermutations("abc","");

    }

    private static void printPermutations(String str, String perm) {

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutations(newStr,perm+ch);
        }

    }


}
