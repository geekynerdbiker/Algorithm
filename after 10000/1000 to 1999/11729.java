import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();
    public static int answer = 0;

    public static void main(String args[]) {
        int n = kb.nextInt();

        moveHanoiT(n, 1, 2, 3);

        sb.insert(0, answer + "\n");
        System.out.println(sb);
    }

    public static void moveHanoiT( int n, int from, int by, int to ) {
        ++answer;

        if( n == 1 )
            sb.append( from + " " + to + "\n" );

        else {
            moveHanoiT( n - 1, from, to, by );
            sb.append( from + " " + to + "\n" );
            moveHanoiT( n - 1, by, from, to );
        }
    }
}