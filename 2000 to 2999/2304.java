import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        Stack<Integer> stack = new Stack<>();
        int [] warehouse = new int [1001];
        int first = 1001, last = 0;
        int L, H, max = 0, result = 0;
        
        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            warehouse[L] = H;
            
            if( last < L ) last = L;
            if( first > L ) first = L;
            if( H > warehouse[max] ) max = L;
        }
        
        for( int i = first; i <= max; i++ )
        {
            if( warehouse[i] != 0 )
            {
                if ( stack.empty() ) stack.push(warehouse[i]);
                else if( warehouse[i] > stack.peek() ) stack.push(warehouse[i]);
            }
            result += stack.peek();
        }
        
        while( !stack.empty() ) stack.pop();
        
        for( int i = last; i > max; i--)
        {
            if( warehouse[i] != 0)
            {
                if( stack.empty() ) stack.push(warehouse[i]);
                else if( warehouse[i] > stack.peek()) stack.push(warehouse[i]);
            }
            result += stack.peek();
        }
        
        System.out.println(result);
    }
}
