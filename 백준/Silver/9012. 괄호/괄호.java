import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) { 
            String input = sc.nextLine(); 
            int left = 0; 
            int right = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i); 
                if (c == '(' ) { 
                    left++;
                } else if (c == ')') {
                    right++;
                }

                if (right > left) {
                    System.out.println("NO"); 
                    break; 
                }
            }

            if (left == right) { 
                System.out.println("YES"); 
            } else if (right <= left) { 
                System.out.println("NO"); 
            }
        }
    }
}