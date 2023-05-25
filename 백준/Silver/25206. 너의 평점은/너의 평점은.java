import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double toavg = 0;
        double tosco = 0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double score = sc.nextDouble();
            String avg = sc.next();

            if (avg.equals("A+")){
                toavg += score * 4.5;
                tosco += score;
            }if (avg.equals("A0")) {
                toavg += score * 4.0;
                tosco += score;
            }if (avg.equals("B+")) {
                toavg += score * 3.5;
                tosco += score;
            }if (avg.equals("B0")) {
                toavg += score * 3.0;
                tosco += score;
            }if (avg.equals("C+")) {
                toavg += score * 2.5;
                tosco += score;
            }if (avg.equals("C0")) {
                toavg += score * 2.0;
                tosco += score;
            }if (avg.equals("D+")) {
                toavg += score * 1.5;
                tosco += score;
            }if (avg.equals("D0")) {
                toavg += score * 1.0;
                tosco += score;
            }if (avg.equals("F")) {
                toavg += score * 0.0;
                tosco += score;
            }
        }

            System.out.printf("%.6f", toavg/tosco);
    }
}