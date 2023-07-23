import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        // n>123456, 2n은 최대 246912
        int[] arr = new int[123456 * 2 + 1];

        for (int i = 1; i < arr.length; i++) {
            if (i == 1) {
                arr[i] = -1;
            } else {
                arr[i] = i;
            }
        }

        for (int i = 3; i < arr.length; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i != j && i % j == 0) {
                    arr[i] = -1;
                }
            }
        }

        while (true) {
            int n = sc.nextInt();

            if (n == 0)
                break;

            int count = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (arr[i] != -1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}