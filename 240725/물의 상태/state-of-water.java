import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();
        if (degree >= -200 && degree <= 200) {
            if (degree < 0) {
                System.out.println("ice");
            } else if (degree >= 100) {
                System.out.println("vapor");
            } else if (degree >= 0 && degree < 100) {
                System.out.println("water");
            }    
        }
    }
}