import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        String swappedString = swapCase(inputString);
        System.out.println(swappedString);
    }

    public static String swapCase(String inputStr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}