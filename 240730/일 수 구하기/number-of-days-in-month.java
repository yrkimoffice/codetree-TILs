import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1, 3, 5, 7, 8,10,12 => 31
        // 4, 6, 9, 11 => 30
        // 2 => 28, 29
        if ((n <= 7 && n % 2 == 1) || (n >= 8 && n % 2 == 0)) {
            System.out.println("31");   
        } else if (n == 2) {
            System.out.println("28");
        } else if ((n <= 6 && n % 2 == 0) || (n >= 9 && n % 2 == 1)) {
            System.out.println("30");
        } 
    }
}