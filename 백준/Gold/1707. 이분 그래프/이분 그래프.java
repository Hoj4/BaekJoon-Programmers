import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int n, m;
    static List[] check;
    static int checked[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();

            check = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                check[i] = new ArrayList();
            }

            checked = new int[n + 1];

            for (int k = 0; k < m; k++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                check[x].add(y);
                check[y].add(x);
            }

            for (int i = 1; i <= n; i++) {
                if (checked[i] == 0) {
                    dfs(i, 1);
                }
            }

            if (isPossible()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isPossible() {
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < check[i].size(); k++) {
                if (checked[i] == checked[(int) check[i].get(k)]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void dfs(int node, int c) {
        checked[node] = c;

        for (int i = 0; i < check[node].size(); i++) {
            int next = (int) check[node].get(i);
            if (checked[next] == 0) {
                dfs(next, 3 - c);
            }
        }
    }
}