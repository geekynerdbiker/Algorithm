import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        
        while( N > 0 ) {
            num++;
            String s = Integer.toString(num);
            
            if( s.contains("666") ) N--;
        }
        System.out.println(num);
    }
}
