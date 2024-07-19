public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int temp1, temp2; 
        temp1 = b; // 6
        b = a; // 5
        temp2 = c; // 7
        c = temp1; //6
        a = temp2; // 7
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}