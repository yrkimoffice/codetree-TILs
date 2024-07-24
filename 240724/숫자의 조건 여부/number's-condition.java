import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= -1000 && a <= 1000) {
            if (a >= 113) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}