import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashSet<String> hs = new HashSet();
		ArrayList<String> list = new ArrayList();
		
		for (int i = 0; i < N; i++) {
			hs.add(sc.next());
		}
		
		int count = 0;
		for (int i = 0; i < M; i++) {
			String s = sc.next();
			if(hs.contains(s)){
				list.add(s);
				count++;
			}
		}
		Collections.sort(list);
		System.out.println(count);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}