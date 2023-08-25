import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);

            if (command == 1) {
                int X = Integer.parseInt(input[1]);
                stack.push(X);
            } else if (command == 2) {
                if (!stack.isEmpty()) {
                    output.append(stack.pop()).append('\n');
                } else {
                    output.append("-1").append('\n');
                }
            } else if (command == 3) {
                output.append(stack.size()).append('\n');
            } else if (command == 4) {
                if (stack.isEmpty()) {
                    output.append("1").append('\n');
                } else {
                    output.append("0").append('\n');
                }
            } else if (command == 5) {
                if (!stack.isEmpty()) {
                    output.append(stack.peek()).append('\n');
                } else {
                    output.append("-1").append('\n');
                }
            }
        }

        System.out.print(output);
    }
}