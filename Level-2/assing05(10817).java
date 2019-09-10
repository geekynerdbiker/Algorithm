/*
 Q. 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 Output. 두 번째로 큰 정수를 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        
        if( a < b )
            if( a < c )
                if( b < c )
                    System.out.println(b);
                else
                    System.out.println(c);
                else
                    System.out.println(a);
                else
                    if( b < c)
                        if( a < c)
                            System.out.println(a);
                        else
                            System.out.println(c);
                        else
                            System.out.println(b);
    }
}
