import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        Stack<Character> stack = new Stack<>();
        char [] word;
        
        int count = 0;
        while( N-- > 0 ) {
            stack = new Stack<>();
            word = br.readLine().toCharArray();
            
            for( int i = 0; i < word.length; i++ ) {
                if( stack.isEmpty() ) stack.push(word[i]);
                else {
                    if( stack.peek().equals(word[i]) ) stack.pop();
                    else stack.push(word[i]);
                }
            }
            if( stack.isEmpty() ) count++;
        }
        System.out.println(count);
    }
}
