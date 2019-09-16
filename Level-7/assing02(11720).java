/*
 Q. N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 Output. 입력으로 주어진 숫자 N개의 합을 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int ic, sum = 0;
        
        String s = kb.next();
        char [] c = new char [n];
        
        for( int i = 0; i < n; i++ ) {
            c[i] = s.charAt(i);
            ic = (int)c[i] - 48;
            sum += ic;
        }
        
        System.out.println(sum);
        
    }
}
