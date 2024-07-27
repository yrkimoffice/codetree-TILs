import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midScore = sc.nextInt();
        int finScore = sc.nextInt();

        int scholar = 0;

        if (midScore >= 90) {
            if (finScore >= 95) {
                scholar = 100000;
            } else if (finScore >= 90) {
                scholar = 50000;
            }
        }
        System.out.println(scholar);
    }
}