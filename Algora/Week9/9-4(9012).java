import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        int status = 0;
        char [] vps;
        
        for( int i = 0; i < N; i++ ) {
            vps = br.readLine().toCharArray();
            
            for( int j = 0; j < vps.length; j++ ) {
                if( status < 0 ) break;
                if( vps[j] == '(') status++;
                else status--;
            }
            if( status == 0) System.out.println("YES");
            else System.out.println("NO");
            status = 0;
        }
    }
}
