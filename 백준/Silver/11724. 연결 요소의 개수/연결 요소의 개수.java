import java.util.*;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] v;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 노드 수
        int M = sc.nextInt(); // 간선 수

        v = new boolean[N + 1];
        list = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            list[from].add(to);
            list[to].add(from);
        }

        answer = 0;
        for (int i = 1; i < list.length; i++) {
            if (v[i] == false) {
                v[i] = true;
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int start) {
        if (v[start] == false) {
            return;
        }

        for (Integer now : list[start]) {
            if (v[now] == false) {
                v[now] = true;
                dfs(now);
            }
        }
    }
}