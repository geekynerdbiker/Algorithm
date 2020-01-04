/*
 Q. 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 Output. 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int count = 0;
        
        for( int i = 1; i <= n; i++) {
            if( isIso(i) == true)
                count++;
        }
        
        System.out.println(count);
    }
    
    static boolean isIso( int k ) {
        
        if( k < 100 )
            return true;
        
        else if(k == 1000)
            return false;
        
        else {
            int [] n = new int [3];
            
            for( int i = 0; i < 3; i++) {
                n[i] = k % 10;
                k /= 10;
            }
            
            if( (n[0] - n[1]) == (n[1] - n[2]) )
                return true;
            return false;
        }
    }
}
