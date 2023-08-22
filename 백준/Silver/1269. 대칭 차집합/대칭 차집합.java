import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int duple = 0;
        for(int i=0;i<A+B;i++)
            if(!hs.add(sc.nextInt())) duple++;
        System.out.println(hs.size()-duple);
    }
}