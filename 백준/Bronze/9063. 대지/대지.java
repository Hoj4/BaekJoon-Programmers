import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }
        int min_x = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE;
        int min_y = Integer.MAX_VALUE;
        int max_y = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            min_x = Math.min(min_x, points[i][0]);
            max_x = Math.max(max_x, points[i][0]);
            min_y = Math.min(min_y, points[i][1]);
            max_y = Math.max(max_y, points[i][1]);
        }

        int width = max_x - min_x;
        int height = max_y - min_y;
        int area = width * height;

        System.out.println(area);
    }
}