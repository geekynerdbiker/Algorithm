import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) {
        int T = kb.nextInt(), x1, y1, r1, x2, y2, r2;
        double d, r;
        
        for( int i = 0; i < T; i++ ) {
            x1 = kb.nextInt();
            y1 = kb.nextInt();
            r1 = kb.nextInt();
            x2 = kb.nextInt();
            y2 = kb.nextInt();
            r2 = kb.nextInt();
            
            d = Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2);
            r = Math.sqrt(d);
            
            if( x1 == x2 && y1 == y2 && r1 == r2)
                System.out.println(-1);
            else if( (x1 == x2 && y1 == y2 && r1 != r2) ||  (r > r1 + r2) || (r < Math.abs(r1 - r2)))
                System.out.println(0);
            else if( r == (r1 + r2) || r == Math.abs(r2 - r1))
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
