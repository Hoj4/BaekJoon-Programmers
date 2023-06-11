import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, new PointComparator());

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }

        scanner.close();
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class PointComparator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if (p1.y != p2.y) {
                return p1.y - p2.y;
            } else {
                return p1.x - p2.x;
            }
        }
    }
}