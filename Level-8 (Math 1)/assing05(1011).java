import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int T = kb.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int n1 = kb.nextInt();
            int n2 = kb.nextInt();
            
            System.out.println(getDist(n2-n1));
        }
    }
    
    public static int getDist(int n) {
        int k = 1;
        
        while( !((Math.pow(k-1, 2) ) <= n && (Math.pow(k, 2) + k) >= n) )
            k++;
        
        if( n > Math.pow(k, 2) )
            return k * 2;
        else
            return k * 2 - 1;
    }
}
