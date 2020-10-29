import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int x = kb.nextInt();

        for( int i = 0; i < n; i++ ) {
            int a = kb.nextInt();
            if( a < x )
                System.out.print(a + " ");
        }
    }
}