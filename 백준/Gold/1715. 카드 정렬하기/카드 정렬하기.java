import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            pqueue.add(sc.nextInt());
        }
        
        int sum = 0;
        
        while (pqueue.size() > 1) {
            int a = pqueue.poll();
            int b = pqueue.poll();
            sum += a + b;
            pqueue.add(a + b);
        }
        
        System.out.println(sum);
    }
}