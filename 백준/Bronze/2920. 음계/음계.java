import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];
        
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }
        String output = "";
        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i] == inputs[i + 1] - 1) {
                output = "ascending"; // 현재 숫자와 다음 숫자의 차이가 1이면 ascending
            } else if (inputs[i] == inputs[i + 1] + 1) {
                output = "descending"; // 현재 숫자와 다음 숫자의 차이가 -1이면 descending
            } else {
                output = "mixed";
                break;
            }
        } 
        System.out.println(output);
    }
}