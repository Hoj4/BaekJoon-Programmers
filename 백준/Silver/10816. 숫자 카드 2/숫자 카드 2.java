import java.util.Scanner;

public class Main {
    static final int UPPER_MAX = 10000000;
    static final int MAX_ARRAY = (UPPER_MAX * 2) + 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] checkCards = new int[MAX_ARRAY];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            checkCards[sc.nextInt() + UPPER_MAX]++;
        }

        cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            sb.append(checkCards[sc.nextInt() + UPPER_MAX]).append(" ");
        }

        System.out.println(sb.toString());
    }
}