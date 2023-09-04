import java.util.Scanner;

public class Main {

    static int recursionCount;

    public static int recursion(String s, int l, int r) {
        recursionCount++;
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l+1, r-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < T; i++) {
            recursionCount = 0;
            String input = sc.nextLine();
            int result = recursion(input, 0, input.length() - 1);
            System.out.println(result+" "+recursionCount);
        }
    }
}