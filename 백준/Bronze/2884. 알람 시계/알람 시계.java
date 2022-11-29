import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int H = Scanner.nextInt();
		int M = Scanner.nextInt();
     		if (M < 45) {
			    H=H-1;
			    M=M+15;
			if (H<0) {
			    H=23;
			}
			    System.out.println(H + " " + M);
		} else {
			    M=M-45;
			System.out.println(H + " " + M);
		}
	}
}