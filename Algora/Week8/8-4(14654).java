import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt();
        int [] team1 = new int [N], team2 = new int [N];
        int max = 0, score = 0, winner = 0;
        
        for( int i = 0; i < N; i++ )
            team1[i] = kb.nextInt();
        
        for( int i = 0; i < N; i++ )
            team2[i] = kb.nextInt();
        
        for( int i = 0; i < N; i++ ) {
            int result = isWin(team1[i], team2[i]);
            if( result == 0 ) result = -1 * winner;
            if( result == winner ) score++;
            else {
                score = 1;
                winner = result;
            }
            max = Math.max(score, max);
        }
        System.out.println(max);
    }
    
    public static int isWin(int a, int b) {
        if( a == 3 && b == 1 ) return -1;
        else if( a == 1 && b == 3 ) return 1;
        else if( a > b ) return 1;
        else if( a == b ) return 0;
        else return -1;
    }
}
