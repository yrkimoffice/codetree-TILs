import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int engA = sc.nextInt();

        int mathB = sc.nextInt();
        int engB =sc.nextInt();

        // 수학점수가 높은 경우 더 높은 학생 이름 출력
        // 수학점수가 같으면 영어점수가 더 높은 학생 이름 출력
        if (mathA > mathB) {
            System.out.println("A");   
        } else if (mathA == mathB) {
            System.out.println(engA > engB ? "A" : "B");
        }
    }
}