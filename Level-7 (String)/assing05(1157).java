/*
 Q. 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 
 Input. 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 Output. 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int [] alpha = new int[26];
        int rst = 0, cnt = 0, index = 0;
        
        String s = kb.next();
        
        for( int i = 0; i < s.length(); i++ )
            if( s.charAt(i) >= 65 && s.charAt(i) <= 90)
                alpha[s.charAt(i) - 65]++;
            else if( s.charAt(i) >= 97 && s.charAt(i) <= 122)
                alpha[s.charAt(i) - 97]++;
        
        for( int i = 0; i < alpha.length; i++ )
            if( rst < alpha[i] ) {
                rst = alpha[i];
                index = i;
            }
        
        for( int i = 0; i < alpha.length; i++ )
            if( rst == alpha[i] )
                cnt++;
        
        if( cnt == 1 )
            System.out.println((char)(index + 65));
        else
            System.out.println("?");
    }
}
