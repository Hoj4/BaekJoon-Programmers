import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] A = new int[a];
		int[] B = new int[a];
		
		for(int i = 0; i < a; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < a; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int sum = 0;
		for(int i = 0; i < a; i++) {
			sum += A[i] * B[a - 1 - i];
		}
		System.out.println(sum);
	}
}