import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean isNormalYear = (y % 4 != 0);   

        if (isNormalYear || (y % 100 == 0 && y % 400 != 0)) {
            System.out.println("false");     
        } else {
            System.out.println("true");    
        }
    }
}