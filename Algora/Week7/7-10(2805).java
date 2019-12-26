import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt(), M = kb.nextInt(), max = 0;
        int [] tree = new int [N];
        
        for( int i = 0; i < N; i++ ) {
            tree[i] = kb.nextInt();
            
            if( max < tree[i]) max = tree[i];
        }
        
        int start = 0, end = max, h = 0;
        while( start <= end ) {
            int mid = (start + end) / 2;
            long sum = 0;
            for( int i = 0; i < N; i++ )
                if( mid < tree[i] ) sum += tree[i] - mid;
            
            if( sum >= M ) {
                if( h < mid ) h = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        System.out.println(h);
    }
}
