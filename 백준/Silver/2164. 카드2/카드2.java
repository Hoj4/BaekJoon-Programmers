import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i); // 1부터 N까지의 카드를 큐에 순서대로 추가
        }

        while (queue.size() > 1) {
            queue.remove(); // 제일 위에 있는 카드를 버림
            Integer top = queue.poll(); // 제일 위에 있는 카드를 가져옴
            if (top == null) break;
            queue.add(top);
        }
        System.out.println(queue.peek()); 
    }
}