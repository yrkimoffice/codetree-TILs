import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int z = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("010-%d-%d", y, x);
        
    }
}