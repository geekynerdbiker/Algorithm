import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        char [] word = kb.next().toCharArray();
        int len = word.length;
        
        for( int i = 0; i < word.length; i++ ) {
            if( len == 1 )
                break;
            
            if( word[i] == '=' ) {
                if( i - 1 >= 0 && (word[i-1] == 'c' || word[i-1] == 's') ) {
                    i++;
                    len--;
                }
                else if( i - 1 >= 0 && word[i-1] == 'z') {
                    if( i - 2 >= 0 && word[i-2] == 'd')
                        len--;
                    i++;
                    len--;
                }
            }
            
            else if( word[i] == '-' ) {
                if( i - 1 >= 0 && (word[i-1] == 'c' || word[i-1] == 'd') ) {
                    i++;
                    len--;
                }
            }
            
            else if( word[i] == 'j' ) {
                if( i - 1 >= 0 && (word[i-1] == 'l' || word[i-1] == 'n') ) {
                    i++;
                    len--;
                }
            }
        }
        System.out.println(len);
    }
}
