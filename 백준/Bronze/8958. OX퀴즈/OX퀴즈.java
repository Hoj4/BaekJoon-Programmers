import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    
	  Scanner s = new Scanner(System.in);
 	  int a = s.nextInt();
	  
	  for (int i=1; i<=a; i++) { 
		  String arr = s.next();
		  
		  int b = 0;
		  int c =0;
		  for(int j=0; j<arr.length();j++) {
			  
			  if(arr.charAt(j)=='O') {
				  c++;
				  b+=c;
			  } else if(arr.charAt(j)=='X') {
				  c=0;
			  }
		  }  
		  System.out.println(b);
	  }
   }
}