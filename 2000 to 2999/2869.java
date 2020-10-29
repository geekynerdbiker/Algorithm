import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String args[]) {
        int a = kb.nextInt();
        int b = kb.nextInt();
        int v = kb.nextInt();

        if( a >= v ) {
            System.out.println("1");
            return;
        }

        if( (v - a) % (a - b) == 0 )
            System.out.println( (v - a) / (a - b) + 1 );
        else
            System.out.println( (v - a) / (a - b) + 2 );
    }
}