import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        
        System.out.println(pibonacci(n));
    }
    
    public static int pibonacci(int n) {
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;
        return pibonacci(n - 1) + pibonacci(n - 2);
    }
}
