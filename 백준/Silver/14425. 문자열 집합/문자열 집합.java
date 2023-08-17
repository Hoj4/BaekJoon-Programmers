import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            map.put(sc.next(), 0);
        }
        int count = 0;
        for (int i = 0; i < b; i++) {
            if (map.containsKey(sc.next())) count++;
        }
        System.out.print(count);
    }
}