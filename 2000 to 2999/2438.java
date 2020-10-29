import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        for( int i = 1; i <= n; i++ ) {
            for( int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
