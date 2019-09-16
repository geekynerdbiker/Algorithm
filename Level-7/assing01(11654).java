/*
 Q. 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 
 Input. 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 Output. 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        char c = kb.next().charAt(0);
        int ic = (int)c;
        
        System.out.printf("%d", ic);
        
    }
}
