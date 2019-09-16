/*
 Q. 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 Output. 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
    만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int order = 0;
        
        String s = kb.next();
        char [] c = new char [s.length()];
        int [] alp = new int [26];
        boolean [] alpCheck = new boolean [26];
        
        Arrays.fill(alp, -1);
        
        for( int i = 0; i < s.length(); i++ ) {
            c[i] = s.charAt(i);
            
            if (alpCheck[(int)c[i] - 97] == false)
                alp[(int)c[i] - 97] = order++;
            else
                order++;
            alpCheck[(int)c[i] - 97] = true;
        }
        for( int i = 0; i < alp.length; i++ )
            System.out.print(alp[i] + " ");
        
    }
}

/*
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(input.indexOf(c) + " ");
    }
}
*/
