import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final StringBuilder sb = new StringBuilder();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt(), K = kb.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        int k = K - 1;
        
        for( int i = 0; i < N; i++ )
            ar.add(i+1);
        
        sb.append("<");
        for( int i = 0; i < N; i++ ) {
            sb.append(ar.get(k));
            ar.remove(k);
            
            if( ar.size() == 0 ) break;
            sb.append(", ");
            
            k += K - 1;
            k = k % ar.size();
        }
        sb.append(">");
        System.out.println(sb);
        
    }
}
