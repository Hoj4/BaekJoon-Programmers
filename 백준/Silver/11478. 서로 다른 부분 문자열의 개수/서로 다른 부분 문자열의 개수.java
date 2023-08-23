import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        int len = S.length();
        Set<String> hs = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String s = S.substring(i, j);
                hs.add(s);
            }
        }
        System.out.println(hs.size());
    }
}