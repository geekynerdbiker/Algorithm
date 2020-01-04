/*
 Q. M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
 Output. 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int m = kb.nextInt(), n = kb.nextInt();
        
        for( int i = m; i <= n; i++ ) {
            if( isPrime(i) )
                System.out.println(i);
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
