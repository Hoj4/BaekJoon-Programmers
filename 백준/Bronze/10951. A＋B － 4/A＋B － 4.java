import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
        // 종료 조건이 없어 무한 반복하는 문제 
        // 끝을 모르니까 while
        // hasNext() -> 뒤에 값이 더 없을 경우 false를 반환 -> 반복문 종료
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);

		}
	}
}