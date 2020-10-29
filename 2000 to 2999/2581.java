import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int m = kb.nextInt(), n = kb.nextInt();
        int pMin = 0, pSum = 0;
        boolean minFlag = false;
        
        for( int i = m; i <= n; i++ ) {
            if( isPrime(i) ) {
                pSum += i;
                
                if( minFlag == false ) {
                    pMin = i;
                    minFlag = true;
                }
            }
        }
        if( minFlag == false )
            System.out.println("-1");
        else
            System.out.println(pSum + "\n" + pMin);
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
