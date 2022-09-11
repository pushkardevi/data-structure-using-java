package ApnaCollege;

public class Recursion10 {

    private static final String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        printCombinations("23",0,"");
    }


    private static void printCombinations(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i <= str.length(); i++) {
            printCombinations(str, idx + 1, combination + mapping.charAt(i));
        }
    }
}
