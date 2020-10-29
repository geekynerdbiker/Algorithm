import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String args[]) {
        int T = kb.nextInt();

        for( int i = 0; i < T; i++ ) {
            int k = kb.nextInt();
            int n = kb.nextInt();

            System.out.println(getValue(k, n));
        }
    }

    public static int getValue(int k, int n) {
        if( k == 0 )
            return n;
        if( n == 0 )
            return 0;
        return getValue(k - 1, n) + getValue(k, n - 1);
    }
}