import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    
    public static void main(String args[]) throws NumberFormatException, IOException {
        int N = Integer.parseInt(br.readLine());
        int [] group = new int [N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for( int i = 0; i < N; i++ )
            group[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int B = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        long total = 0;
        
        for( int i = 0; i < N; i++ ) {
            int k = group[i] -= B;
            total++;
            
            if( k <= 0 ) continue;
            if( k % C == 0) total += k / C;
            else {
                total += k / C;
                total++;
            }
        }
        System.out.println(total);
    }
}
