import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1, 3, 5, 7, 9, 11 && 12 => 31
        // 4, 6, 8, 10, 12 => 30
        // 2 => 28, 29
        if (n % 2 == 1 || n == 12) {
            System.out.println("31");
        } else if (n != 2 && n % 2 == 0) {
            System.out.println("30");
        } else if (n == 2) {
            System.out.println("28");
        }
    }
}