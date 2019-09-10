/*
 Q. 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 Output. 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        for( int i = 0; i < n; i++ )
            System.out.println(i+1);
    }
}
