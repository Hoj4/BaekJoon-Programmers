	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int max = a;
			if(max < b)
				max = b;
			if(max < c)
				max = c;
			
			if(a==b && b == c){
				System.out.println(10000+a*1000);
			}else if(a == b && a != c)
				System.out.println(1000+a*100);
			else if(a == c && a != b)
				System.out.println(1000+a*100);
			else if(b == c && b != a)
				System.out.println(1000+b*100);
			else
				System.out.println(max * 100);
		}
	
	}