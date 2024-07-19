import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double cm = 30.48 * n;
        System.out.printf("%.1f", cm);
    }
}