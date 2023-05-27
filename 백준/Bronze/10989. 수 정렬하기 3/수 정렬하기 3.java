import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int num = Integer.parseInt(input);
            arr[i] = num;
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]);
            sb.append('\n');
        }
        
        System.out.println(sb.toString());
    }
}