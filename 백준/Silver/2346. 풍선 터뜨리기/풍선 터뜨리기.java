import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            q.add(new int[] { (i + 1), num }); // {풍선 idx, 내용}
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int in = q.poll()[1];

        while (!q.isEmpty()) {
            if (in > 0) {
                for (int i = 1; i < in; i++) {
                    q.add(q.poll());
                }

                int[] nxt = q.poll();
                in = nxt[1];
                sb.append(nxt[0] + " ");
            }
            else {
                for (int i = 1; i < -in; i++) {
                    q.addFirst(q.pollLast());
                }

                int[] nxt = q.pollLast();
                in = nxt[1];
                sb.append(nxt[0] + " ");
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}