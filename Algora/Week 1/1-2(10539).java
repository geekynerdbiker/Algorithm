import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int N = kb.nextInt(), sum = 0;
        
        int [] A = new int [N];
        int [] B = new int [N];
        
        for( int i = 0; i < N; i++ )
            B[i] = kb.nextInt();
        
        A[0] = B[0];
        
        for( int i = 0; i < N; i++ ) {
            if( i == 0 )
                System.out.print(B[i]);
            else {
                sum += A[i-1];
                A[i] = (i+1) * B[i] - sum;
                System.out.print(" " + A[i]);
            }
        }
    }
}
