import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //a, b, c
        //a, c, b

        //c, a, b
        //c, b, a
        //b, a, c
        //b, c, a


        if ((a <= b && b <= c) || (b <= a && a <= c)) {
            System.out.println(c);
        } else if ((a <= c && c <= b) || (c <= a && c <= b)) {
            System.out.println(b);
        } else if ((c <= b && b <= a) || (b <= c && c <= a)) {
            System.out.println(a);
        } 
    }
}