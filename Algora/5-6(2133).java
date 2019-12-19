import java.util.*;

public class Main {
    public static final Scanner kb = new Scanner(System.in);
    public static int [] DP;
    
    public static void main(String[] args) {
        int N = kb.nextInt();
        DP = new int [N+1];
        
        if( N % 2 == 0 ) System.out.println(func(N));
        else System.out.println(0);
    }
    
    public static int func(int N) {
        if( N == 0 ) return 1;
        if( N == 2 ) DP[2] = 3;
        else if( DP[N] == 0 )
            for( int i = 2; i <= N; i += 2 ) {
                int std = ( i == 2 ) ? 3 : 2;
                DP[N] += std * func(N - i);
            }
        return DP[N];
    }
}
