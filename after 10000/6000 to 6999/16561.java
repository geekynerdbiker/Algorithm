import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int ret, n = kb.nextInt();
        
        if( n < 9 ) ret = 0;
        else if( n == 9 ) ret = 1;
        else {
            n -= 9;
            n /= 3;
            ret = dfs(n, 2);
        }
        System.out.println(ret);
    }
    
    public static int dfs(int num, int cnt) {
        if( cnt == 0 ) return 1;
        int ret = 0;
        for( int i = num; i >= 0; i-- ){
            ret += dfs(i, cnt - 1);
        }
        return ret;
    }
}
