import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        while( kb.hasNextInt()) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            System.out.println(a+b);
        }
    }
}
