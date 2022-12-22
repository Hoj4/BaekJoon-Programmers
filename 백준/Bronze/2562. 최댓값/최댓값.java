import java.util.*;
    public class Main {
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int a = 0;
		    int b = 0;
		    for(int i=1; i<=9; i++) {
			    int c = sc.nextInt();
			    if( a < c) {
				    a = c;
				    b = i;
			        }
		        }
		System.out.println(a);
		System.out.println(b);	
	}
}