import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt();
        char [] s = br.readLine().toCharArray();
        
        System.out.println(Hashing(N, s));
    }
    
    public static long Hashing(int n, char [] string) {
        long result = 0;
        
        for( int i = 0; i < n; i++ )
            result += (string[i]-'a'+1) * Math.pow(31, i);
        
        return result % 1234567891;
    }
}
