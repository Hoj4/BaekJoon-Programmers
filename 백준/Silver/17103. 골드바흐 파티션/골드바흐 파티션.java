import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] primeNums = new boolean[1000001];

    // 에라토스테네스의 체
    public static void getPrime() {
        for (int i = 2; i < Math.sqrt(primeNums.length); i++) {
            if (primeNums[i])
                continue;
            for (int j = i * i; j < primeNums.length; j += i)
                primeNums[j] = true;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        getPrime(); // 배열 초기화

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int count = 0; 

            for (int i = 2; i <= n / 2; i++) {
                if (!primeNums[i] && !primeNums[n - i])
                    count++;
            }

            System.out.println(count); 
        }
    }
}