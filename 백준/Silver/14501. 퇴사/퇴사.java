import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n+1];
		int p[] = new int[n+1];
		int dp[] = new int[n+2]; 
		
		for (int i=1;i<=n;i++) {
			t[i]=sc.nextInt();
			p[i]=sc.nextInt();
		}
		
		int index;
		for (int i=1 ;i<=n ;i++) {
			index = i+t[i];
			if (index <= n+1){ 
				for (int j=n+1 ;j>=index ;j--)
					if (dp[j]<p[i]+dp[i]){
						dp[j]=p[i]+dp[i];
				}	
			}
		}
		System.out.println(dp[n+1]);
	}
}