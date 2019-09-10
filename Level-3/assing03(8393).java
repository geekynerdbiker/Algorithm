/*
 Q. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

 Input. 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 Output. 1부터 n까지 합을 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int sum = 0;
        
        for( int i = 1; i <= n; i++ )
            sum +=i;
        System.out.println(sum);
        
        
        kb.close();
    }
}
