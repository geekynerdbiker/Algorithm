import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int answer;
    public static void main(String args[]) throws IOException {
        int [] board = new int [3];
        char [] c = new char [3];
        
        int N = kb.nextInt();
        
        for( int t = 0; t < N; t++ ) {
            for( int i = 0; i < 3; i++ ) {
                board[i] = 0;
                c = br.readLine().toCharArray();
                
                for( int j = 0; j < 3; j++ )
                    if( c[j] == '*' ) board[i] |= (1 << j);
            }
            
            answer = 100;
            dfs(0, 0, board);
            System.out.println(answer);
        }
    }
    
    public static void push(int y, int x, int [] board)
    {
        board[y] ^= (1 << x);
        
        if( y - 1 >= 0 ) board[y-1] ^= (1 << x);
        if( x - 1 >= 0 ) board[y] ^= (1 << (x - 1));
        if( y + 1 < 3 )    board[y + 1] ^= (1 << x);
        if( x + 1 < 3 )    board[y] ^= (1 << (x + 1));
    }
    
    public static void dfs(int n, int count, int [] board)
    {
        if( n == 3 ) {
            int [] table = { board[0], board[1], board[2] };
            
            for( int i = 0; i < 3; i++ )
                if( ((table[0] >> i) & 1) != 0 ) {
                    count++;
                    push(1, i, table);
                }
            
            if( table[0] != 0 ) return ;
            
            for( int i = 0; i < 3; i++ ) {
                if( ((table[1] >> i) & 1) != 0 ) {
                    count++;
                    push(2, i, table);
                }
            }
            
            if( table[1] != 0 || table[2] != 0 ) return;
            
            if( count < answer ) answer = count;
            
            return ;
        }
        
        dfs(n + 1, count, board);
        push(0, n, board);
        dfs(n + 1, count + 1, board);
        push(0, n, board);
    }
}
