import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
            if (a < b) {
                System.out.print("1");
            } else {
                System.out.print("0"); 
            }
            System.out.print(" "); 
            if (a == b) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}