import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int z = 0; z < M; z++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            for (int k = i; k < j; k++) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }        
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}