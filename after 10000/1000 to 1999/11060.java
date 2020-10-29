import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt();
        int DP[] = new int [N+100];
        
        DP[0] = 0;
        DP[1] = 1;
        
        for( int i = 1; i <= N; ++i ) {
            int k = kb.nextInt();
            
            if(DP[i] == 0) break;
            
            for( int j = 1; j <= k; ++j ) {
                if( j + k > 1000 ) break;
                if( DP[i+j] > DP[i] + 1 || DP[i+j] == 0)
                    DP[i+j] = DP[i] + 1;
            }
        }
        
        if( DP[N] == 0 )
            System.out.println(-1);
        else
            System.out.println(DP[N] - 1);
    }
}
