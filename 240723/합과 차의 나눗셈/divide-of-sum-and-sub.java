import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = (double) sc.nextInt();
        System.out.printf("%.2f", (a+b) / (a-b));
    }
}