package exercises;

import java.util.Scanner;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    
    public static void main(String args[]) {
        int size = 4, ans = 0;
        
        char [][] puzzle = new char[size][size];
        
        for( int i = 0; i < size; i++ ) {
            String line = kb.next();
            
            for( int j = 0; j < size; j++ )
                puzzle[i][j] = line.charAt(j);
        }
        for( int i = 0; i < size; i++ )
            for( int j = 0; j < size; j++ )
                if( puzzle[i][j] != '.' )
                    ans += abs(i, (puzzle[i][j] - 'A') / 4) + abs(j, (puzzle[i][j] - 'A') % 4);
        System.out.println(ans);
    }
    
    public static int abs(int a, int b) {
        return a > b ? (a - b) : (b - a);
    }
}
