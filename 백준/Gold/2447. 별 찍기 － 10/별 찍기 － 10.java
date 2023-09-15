import java.util.*;
 
public class Main {
	static char arr[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new char[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				star(i,j,N);
			}
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
	}
	static void star(int i, int j, int N) {
		if((i/N)%3 == 1 && (j/N)%3 == 1 ) {
			arr[i][j]=' ';
		}
		else {
			if(N/3 == 0) {
				arr[i][j]='*';
			}
			else {
				star(i,j,N/3);
			}
		}
	}
}