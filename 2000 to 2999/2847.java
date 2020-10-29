import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt();
        int [] score = new int [N];
        
        for( int i = 0; i < N; i++ )
            score[i] = kb.nextInt();
        
        int sum = 0;
        
        for( int i = N-2; i >= 0; i-- ) {
            if( score[i+1] <= score[i] ) {
                sum += score[i] - score[i+1] + 1;
                score[i] = score[i+1] - 1;
            }
        }
        System.out.println(sum);
    }
}
