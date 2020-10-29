import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = 0, pCount = 0;
        
        do {
            n = kb.nextInt();
            if( n == 0 )
                return;
            
            for( int i = n+1; i <= 2*n; i++ )
                if( isPrime(i) )
                    pCount++;
            
            System.out.println(pCount);
            pCount = 0;
        } while( true );
    }
    
    public static boolean isPrime(int k) {    // the sieve of Eratosthenes
        if( k == 1 )
            return false;
        
        int rk = (int)Math.sqrt(k);
        
        for( int i = 2; i <= rk; i++ )
            if( k % i == 0 )
                return false;
        return true;
    }
}
