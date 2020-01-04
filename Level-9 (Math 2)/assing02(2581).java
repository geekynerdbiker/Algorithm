/*
 Q. 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 
 Input. 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다. M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 Output. M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 */
package exercises;

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
