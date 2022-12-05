import java.util.*;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		
		if(m + a >= 60) {
			h = h + (m + a) / 60;
			m = (m + a) % 60;
		}
		else m = m+a;
		
		if(h > 23) h %= 24;
		
		System.out.println(h + " " + m);
		
	}
}