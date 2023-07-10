import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5]; 

        for (int i = 0; i < 5; i++) {
            String[] input = sc.nextLine().split(" ");
            int totalScore = 0;

            // 평가 점수 합산
            for (int j = 0; j < 4; j++) {
                int score = Integer.parseInt(input[j]);
                totalScore += score;
            }
            scores[i] = totalScore; 
        }

        int winner = 0; 
        int maxScore = scores[0]; 

        for (int i = 1; i < 5; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                winner = i;
            }
        }

        int winnerNumber = winner + 1;

        System.out.println(winnerNumber + " " + maxScore); 
    }
}