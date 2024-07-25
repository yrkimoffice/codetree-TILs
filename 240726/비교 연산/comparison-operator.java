import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
            System.out.println((a >= b) ? 1 : 0);
            System.out.println((a > b) ? 1 : 0);
            System.out.println((b >= a) ? 1 : 0);
            System.out.println((b > a) ? 1 : 0);
            System.out.println((a == b) ? 1 : 0);
            System.out.println((a != b) ? 1 : 0);
        } 
    }
}