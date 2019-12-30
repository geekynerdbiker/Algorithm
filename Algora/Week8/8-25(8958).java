import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt();
        
        for( int i = 1; i <= N; i++ ) {
            for( int j = i; j < N; j++ )
                System.out.print(" ");
            for( int k = 1; k <= 2*i - 1; k++ )
                System.out.print("*");
            System.out.println();
        }
    }
}
