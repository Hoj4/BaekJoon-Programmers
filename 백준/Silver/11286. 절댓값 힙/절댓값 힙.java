import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q = new PriorityQueue<>(N, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) > Math.abs(o2)) {
                    return 1;
                } else if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int next = sc.nextInt();

            if (next == 0 && !q.isEmpty()) {
                System.out.println(q.poll());
            } else if (next == 0 && q.isEmpty()) {
                System.out.println(0);
            } else {
                q.add(next);
            }
        }
    }
}