import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int arr[] = new int [100001];
        int dp[][] = new int [100001][3];
        
        for(int i=1; i<=N; i++){
            arr[i] = sc.nextInt();
        }
        dp[1][0] = arr[1];
        dp[1][1] = arr[1];
        for(int i=2; i<=N; i++){
            dp[i][0] = Math.max(dp[i-1][0] + arr[i], arr[i]);
            dp[i][1] = Math.max(dp[i-2][0] + arr[i], dp[i-1][1] + arr[i]);
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=1; i<=N; i++){
            for(int j=0; j<=1; j++){
                max = Math.max(dp[i][j], max);
            }
        }    
        System.out.println(max);
    }
}
