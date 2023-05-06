import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = sc.nextInt();
        
		int xm = Math.min(x, z-x);	// x축 최소거리
		int ym = Math.min(y, a-y);	// y축 최소거리
        
		System.out.println(Math.min(xm, ym));
	}
}