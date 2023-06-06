import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] code = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=","z="};
        for (int i = 0; i < code.length; i++) {
            if (word.contains(code[i])) {
                word = word.replace(code[i], "a");
            }
        }
        System.out.println(word.length());
    }
}
