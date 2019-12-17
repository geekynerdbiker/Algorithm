/*
 Q. 한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 x y w h가 주어진다. w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, w-1보다 작거나 같은 자연수이고, y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
 Output. 첫째 줄에 문제의 정답을 출력한다.
 
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int x = kb.nextInt(), y = kb.nextInt(), w = kb.nextInt(), h = kb.nextInt(), len;
        
        len = (((w - x < x) ? w - x : x) < (( h - y < y ) ? h - y : y)) ? ((w - x < x) ? w - x : x) : (( h - y < y ) ? h - y : y);
        System.out.println(len);
    }
}
