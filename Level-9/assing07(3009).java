/*
 Q. 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 
 Input. 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 Output. 직사각형의 네 번째 점의 좌표를 출력한다.
 
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0;
        
        x1 = kb.nextInt();
        y1 = kb.nextInt();
        
        x2 = kb.nextInt();
        y2 = kb.nextInt();
        
        x3 = kb.nextInt();
        y3 = kb.nextInt();
        
        System.out.println(func(x1, x2, x3) + " " + func(y1, y2, y3));
    }
    
    public static int func (int n1, int n2, int n3) {
        if( n1 != n2 )
            if( n2 != n3 ) return n2;
            else return n1;
            else return n3;
    }
}
