import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static char[][] starMap;
    
    public static void main(String args[]) {
        int n = kb.nextInt();
        starMap = new char[n][n];
        
        for( int i = 0; i < n; i++ ) {
            Arrays.fill(starMap[i], ' ');
        }
        
        star(0, 0, n);
        for( int i = 0; i < n; i++ ) {
            System.out.println(starMap[i]);
        }
    }
    
    public static void star (int x, int y, int n) {
        if(n == 1) {
            starMap[x][y] = '*';
            return;
        }
        
        int m = n / 3;
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                if ( i == 1 && j == 1 ){
                    continue;
                }
                star( x + m * i, y + m * j, m );
            }
        }
    }
}
