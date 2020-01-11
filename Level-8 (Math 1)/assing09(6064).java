import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int T = kb.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int m = kb.nextInt();
            int n = kb.nextInt();
            int x = kb.nextInt();
            int y = kb.nextInt();
            
            int gcb = GCB(m, n);
            int lcm = m * n / gcb;
            int year = -1;
            
            int lDiff = x - 1;
            int rDiff = y - 1;
            
            for (int j = 0; (m * j) < lcm; j++) {
                int mulX = m * j;
                int cur = mulX + lDiff + 1;
                int right = (cur - 1) % n + 1;
                
                if (right == y)
                    year = cur;
            }
            System.out.println(year);
        }
    }
    public static int GCB(int a, int b) {
        if( a > b ) {
            if( a % b != 0 )
                return GCB(b, a % b);
            else
                return b;
        }
        else {
            if( b % a != 0 )
                return GCB(a, b % a);
            else
                return a;
        }
    }
}
