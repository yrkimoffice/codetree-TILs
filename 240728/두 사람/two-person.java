import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt();
        char sA = sc.next().charAt(0);

        int ageB = sc.nextInt();
        char sB = sc.next().charAt(0);

        int result = 0;

        if ((ageA >= 19 || ageB >= 19) && (sA == 'M' || sB == 'M')) {
            result = 1;
        }
        System.out.println(result);

    }
}