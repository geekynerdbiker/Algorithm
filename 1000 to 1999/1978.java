import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int pCount = 0;
        
        for( int i = 0; i < n; i++ ) {
            int k = kb.nextInt();
            if( isPrime(k) )
                pCount++;
        }
        System.out.println(pCount);
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
