package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt(), m = kb.nextInt(), M = kb.nextInt(), T = kb.nextInt(), R = kb.nextInt();
        
        if( m+T > M ) {
            System.out.println("-1");
            return;
        }
        
        int time = 0, eTime = 0;
        int x = m;
        
        for( ;eTime < N; time++ ) {
            if( x+T <= M ) {
                x += T;
                eTime++;
            }
            else {
                if( x-R >= m ) x -= R;
                else x = m;
            }
        }
        System.out.println(time);
    }
}
