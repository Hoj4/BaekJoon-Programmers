import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        String str = Integer.toString(n); 
        char[] A = str.toCharArray(); 

        Arrays.sort(A); 
        StringBuilder sb = new StringBuilder(new String(A)); 

        String result = sb.reverse().toString(); // 내림차순 정렬
        System.out.println(result);
    }
}