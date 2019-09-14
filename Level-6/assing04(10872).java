/*
 Q. 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 Output. 첫째 줄에 N!을 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        System.out.println(factorial(n));
    }
    
    static int factorial( int k ) {
        if(k < 2)
            return 1;
        
        return k * factorial(k - 1);
    }
}
