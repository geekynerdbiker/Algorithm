import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        
        int [] K = new int [M];
        
        st = new StringTokenizer(br.readLine());
        for( int i = 0; i < M; i++ )
            K[i] = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        
        for( int i = 1; i <= N; i++ )
            for( int j = 0; j < M; j++ )
                if( i % K[j] == 0 ) {
                    sum += i;
                    break;
                }
        
        System.out.println(sum);
    }
}
