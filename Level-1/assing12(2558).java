/*
 Q. (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
    (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 Output. 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        int n1 = a*((b%100)%10);//5
        int n2 = a*((b%100)/10);//8
        int n3 = a*(b/100);
        int n = n1 + n2*10 + n3*100;
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n);
    }
}
