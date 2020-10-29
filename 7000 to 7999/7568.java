import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static final int WEIGHT = 0;
    public static final int HEIGHT = 1;
    public static final int RANK = 2;
    
    public static void main(String args[]) {
        int N = kb.nextInt();
        int [][] info = new int [N][3];
        
        for( int i = 0; i < N; i++ ) {
            info[i][WEIGHT] = kb.nextInt();
            info[i][HEIGHT] = kb.nextInt();
        }
        for( int i = 0; i < N; i++ )
            for( int j = 0; j < N; j++ ) {
                if( info[i][WEIGHT] < info[j][WEIGHT] && info[i][HEIGHT] < info[j][HEIGHT] )
                    info[i][RANK]++;
                
            }
        for( int i = 0; i < N-1; i++ )
            System.out.print(info[i][RANK]+1 + " ");
        System.out.println(info[N-1][RANK]+1);
    }
}
