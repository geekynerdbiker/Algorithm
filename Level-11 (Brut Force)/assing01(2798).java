import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) {
        int N = kb.nextInt(), M = kb.nextInt(), value = 0;
        int [] card = new int [N];
        
        for( int i = 0; i < N; i++ )
            card[i] = kb.nextInt();
        
        outline : for( int i = 0; i < N - 2; i++ )
            for( int j = i + 1; j < N - 1; j++ )
                for( int k = j + 1; k < N; k++ ) {
                    int sum = card[i] + card[j] + card[k];
                    
                    if( sum <= M ) value = Math.max(value, sum);
                    if( value == M) break outline;
                }
        System.out.println(value);
    }
}
