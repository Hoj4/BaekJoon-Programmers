import java.util.Scanner;

public class Main{
	static int k = 0;
	static StringBuilder sb = new StringBuilder();
	
	static void hanoi(int n, int start, int temp, int des) { 
		if(n == 1) { 
			k++; 
			sb.append(start+" "+des+"\n"); 
			return;
		}
		
		hanoi(n-1,start,des,temp); 
		sb.append(start+" "+des+"\n"); 
		k++; 
		hanoi(n-1,temp,start,des); 
		
	}
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        hanoi(n,1,2,3);
        
        System.out.println(k); 
        System.out.println(sb);
    }
}