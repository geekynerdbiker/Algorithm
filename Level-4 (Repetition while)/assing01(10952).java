import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        while( a != 0 || b != 0) {
            System.out.println(a+b);
            a = kb.nextInt();
            b = kb.nextInt();
        }
    }
}
