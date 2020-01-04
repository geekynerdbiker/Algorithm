/*
 Q. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 
 Input. 첫째 줄에 N이 주어진다. N은 항상 3의 제곱꼴인 수이다. (3, 9, 27, ...) (N=3k, 1 ≤ k < 8)
 Output. 첫째 줄부터 N번째 줄까지 별을 출력한다.
 */
package exercises;

import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static char[][] starMap;
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        starMap = new char[n][n];
        
        for( int i = 0; i < n; i++ ) {
            Arrays.fill(starMap[i], ' ');
        }
        
        star(0, 0, n);
        for( int i = 0; i < n; i++ ) {
            System.out.println(starMap[i]);
        }
    }
    
    public static void star (int x, int y, int n) {
        if(n == 1) {
            starMap[x][y] = '*';
            return;
        }
        
        int m = n / 3;
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                if ( i == 1 && j == 1 ){
                    continue;
                }
                star( x + m * i, y + m * j, m );
            }
        }
    }
}
