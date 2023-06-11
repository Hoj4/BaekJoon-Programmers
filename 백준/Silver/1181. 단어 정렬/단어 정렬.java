import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
        
 		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		String[] Narr = new String[N];
		
		for(int i=0; i<N ;i++) {
			Narr[i]= scanner.next(); 
		}
		
		Arrays.sort(Narr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});
		
		System.out.println(Narr[0]);
		
		for(int i=1; i<N; i++) {
			if(!Narr[i].equals(Narr[i-1])) {
				System.out.println(Narr[i]);
			}
		}
	}
}