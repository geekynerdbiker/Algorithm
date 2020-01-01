import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt();
        char [] s = br.readLine().toCharArray();
        
        long result = 0, R = 1;
        
        
        for( int i = 0; i < N; i++ ) {
            result += (s[i]-'a'+1) * R;
            result %= 1234567891;
            R *= 31;
            R %= 1234567891;
        }
        
        System.out.println(result);
    }
}
