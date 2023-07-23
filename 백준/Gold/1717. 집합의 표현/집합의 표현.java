import java.util.Scanner;

public class Main {
    static int n, m;
    static int parents[];
    static int a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        parents = new int[n + 1];
        // 서로소 자료 구조 초기화
        // 모든 노드가 독립적인 그룹이 되도록 초기화하는 역할
        set();
        for (int i = 0; i < m; i++) {
            int order = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (order == 0) {
                union(a, b);
            } else {
                int aRoot = find(a);
                int bRoot = find(b);

                if (aRoot == bRoot) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    static void set() {
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }
    }

    static boolean union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);

        if (aRoot == bRoot)
            return false;

        parents[bRoot] = aRoot;
        return true;
    }

    static int find(int a) {
        if (parents[a] == a)
            return a;
        return parents[a] = find(parents[a]);
    }
}