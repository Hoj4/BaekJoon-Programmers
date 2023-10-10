import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 두 수의 공약수로 나눈 몫이 서로소가 될 때까지 나눈다.
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = getGCD(Math.max(a, b), Math.min(a, b));

        System.out.println((a*b)/gcd);
    }

    public static long getGCD(long a, long b) {
        while(b > 0) {
            long tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}