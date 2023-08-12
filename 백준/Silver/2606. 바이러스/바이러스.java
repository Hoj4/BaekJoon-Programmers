import java.util.Scanner;

public class Main {
    static int n;
    static int[] visited;
    static int[][] graph;
    static int ans = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new int[n + 1];
        graph = new int[n + 1][n + 1];

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(1);
        System.out.println(ans - 1);
    }

    static void dfs(int node) {
        if (visited[node] == 1) {
            return;
        }
        visited[node] = 1;
        ans++;

        for (int i = 1; i < n + 1; i++) {
            if (visited[i] == 0 && graph[node][i] == 1) {
                dfs(i);
            }
        }
    }
}