import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        int cnt = 0;
        
        for( int i = 0; i < n; i++ ) {
            boolean [] alpha = new boolean[26];
            char [] word = kb.next().toCharArray();
            int len = word.length;
            
            for( int j = 0; j < len; j++ ) {
                if( alpha[(int)(word[j] - 97)] == true )
                    break;
                if( (j < len - 1 && word[j] != word[j+1]) )
                    alpha[(int)(word[j] - 97)] = true;
                if( j == len - 1 )
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
