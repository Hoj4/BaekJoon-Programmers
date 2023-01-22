import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        String grade[]={"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            Double arr[]=new Double[n];
            double k_score=0;
            for(int i=0 ; i<n ; i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                double sum=a*35+b*45+c*20;
                arr[i]=sum/100;
            }
            for(int i=0 ; i<n ; i++){
                if((i+1)==k){
                    k_score=arr[i];
                }
            }            
            Arrays.sort(arr,Collections.reverseOrder());
            for(int i=0 ; i<n ; i++){
                if(arr[i]==k_score){
                    k=i;
                }
            }
            k=k/(n/10);
            System.out.println("#"+test_case+" "+grade[k]);

        }
    }
}