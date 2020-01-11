import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int T = kb.nextInt();
        
        for( int i = 0; i < T; i ++) {
            int n = kb.nextInt();
            int p1 = n / 2, p2 = n / 2;
            
            while( !(isPrime(p1) && isPrime(p2)) ) {
                p1--;
                p2++;
            }
            System.out.println(p1 + " " + p2);
        }
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
