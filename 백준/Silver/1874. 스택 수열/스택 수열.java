import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int T; // 테스트 케이스의 개수
    static StringBuilder sb = new StringBuilder(); // 연산들을 저장하기 위한 StringBuilder
    static int temp = 1; // 다음에 push할 숫자를 추적하기 위한 변수
    static boolean err = false; // 수열이 불가능한 경우를 나타내는 플래그

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        Stack<Integer> stack = new Stack<>(); // 스택 생성

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 수열에서 다음 숫자를 읽기

            // 오름차순으로 숫자를 스택에 push
            for (; temp <= N; temp++) {
                stack.push(temp);
                sb.append("+").append("\n");
            }

            // 스택의 맨 위 숫자와 수열에서의 다음 숫자를 비교하여 확인
            if (stack.peek() == N) {
                stack.pop(); // 일치하면 pop
                sb.append("-").append("\n");
            } else {
                err = true; // 일치하지 않으면 수열이 불가능한 것으로 플래그 설정
            }
        }

        if (err)
            System.out.println("NO");
        else
            System.out.println(sb);
    }
}