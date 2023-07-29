import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp == 0) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }
        
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        System.out.println(sum);
        sc.close(); 
    }
}