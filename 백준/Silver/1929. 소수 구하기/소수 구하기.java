import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean []number=new boolean[m+1];
        number[0]=false;
        number[1]=false;

        for(int i=2;i<=m;i++) {
            number[i] = true;
        }

        for(int i=2;i<=m;i++) { 
            if (number[i]) { 
                for (int j = i+i; j <= m; j+=i){ 
                    number[j]=false;
                }
            }
        }

        for(int i=n;i<=m;i++){
            if(number[i]){
                System.out.println(i);
            }
        }

    }
}