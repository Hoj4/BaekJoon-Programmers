import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int A = 0;

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int B= sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (B == array[i]){
                A++;
            }
        }

        System.out.println(A);
    }
}