import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    int x1 = Integer.parseInt(st.nextToken());
                    deque.addFirst(x1);
                    break;
                case 2:
                    int x2 = Integer.parseInt(st.nextToken());
                    deque.addLast(x2);
                    break;
                case 3:
                    if (!deque.isEmpty())
                        sb.append(deque.pollFirst()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case 4:
                    if (!deque.isEmpty())
                        sb.append(deque.pollLast()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    if (!deque.isEmpty())
                        sb.append(deque.peekFirst()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case 8:
                    if (!deque.isEmpty())
                        sb.append(deque.peekLast()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
            }
        }
        
        System.out.print(sb.toString());
    }
}