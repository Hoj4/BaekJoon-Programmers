import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); //고정비용
		int b = scanner.nextInt(); //재료비
		int c = scanner.nextInt(); //판매비용
		
		if (c<=b) {
			System.out.println("-1");
		} else {
			System.out.println((a/(c-b))+1);
		}
	}
}
	