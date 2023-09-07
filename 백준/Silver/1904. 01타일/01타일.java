import java.util.Scanner;

public class Main {
    static int N, ans;
    static int[] dp = new int[1000001];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ans = 0;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        ans = Num(N);
        System.out.println(ans);
    }

    private static int Num(int N) {
        if (dp[N] == -1) return dp[N] = (Num(N - 1) + Num(N - 2)) % 15746;
        return dp[N];
    }
}