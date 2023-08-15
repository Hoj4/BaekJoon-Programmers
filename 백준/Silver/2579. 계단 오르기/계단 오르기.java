import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] scores = new int[301];
        int[] dp = new int[301];
        
        for (int i = 1; i <= N; i++) {
            dp[i] = scores[i] = sc.nextInt();
        }
        dp[2] += scores[1];

        for (int i = 3; i <= N; i++) {
            dp[i] += Math.max(dp[i - 2], dp[i - 3] + scores[i - 1]);
        }
        System.out.println(dp[N]);
    }
}