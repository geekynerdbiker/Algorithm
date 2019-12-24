import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt(), count = 1, t = 0;
        
        while( N > 0 ) {
            if( N < count )
                count = 1;
            N -= count;
            count++;
            t++;
        }
        System.out.println(t);
    }
}
