/*
 Q. 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
 
    1/1    1/2    1/3    1/4    1/5    …
    2/1    2/2    2/3    2/4    …    …
    3/1    3/2    3/3    …    …    …
    4/1    4/2    …    …    …    …
    5/1    …    …    …    …    …
    …    …    …    …    …    …
 
 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 Output. 첫째 줄에 분수를 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int k = 0;
        
        while( k * (k + 1) / 2 < n ) {
            k++;
        }
        
        n -= k * (k + 1) / 2;
        
        if( k % 2 != 0 )
            System.out.println( (1-n) + "/" + (k+n) );
        else
            System.out.println( (k+n) + "/" + (1-n) );
    }
}
