import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		if(m + c >= 60) {
			h = h + (m + c) / 60;
			m = (m + c) % 60;
		}
		else m += c;
		
		if(h > 23) h %= 24;
		
		System.out.println(h + " " + m);
		
	}
}
