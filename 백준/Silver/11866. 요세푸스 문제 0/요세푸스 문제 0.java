import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        int index = 0; 

        while (!queue.isEmpty()) {
            index++;
            if (index == K) { 
                sb.append(queue.poll()).append(", ");
                index = 0; 
            } else {
                queue.offer(queue.poll());
            }
        }
        sb.replace(sb.length() - 2, sb.length() - 1, ">");

        System.out.println(sb);
    }
}