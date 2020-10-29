import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String [] Wboard = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW" };
    public static String [] Bboard = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB" };

    public static void main(String args[]) throws IOException {
        StringTokenizer sb = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(sb.nextToken()), M = Integer.parseInt(sb.nextToken());
        char [][] input = new char [N][M];

        for( int i = 0; i < N; i++ ) {
            char [] line = br.readLine().toCharArray();

            for( int j = 0; j < M; j++ )
                input[i][j] = line[j];
        }

        int result = 64;
        for( int x = 0; x + 7 < N; x++ )
            for( int y = 0; y + 7 < M; y++ )
                result = Math.min(result, Math.min(isChessWhite(x, y, input), isChessBlack(x, y, input)));

        System.out.println(result);
    }

    public static int isChessBlack(int x, int y, char [][] board) {
        int chance = 0;

        for( int i = x; i < x + 8; i++ )
            for( int j = y; j < y + 8; j++ )
                if( board[i][j] != Bboard[i-x].charAt(j-y) ) chance++;
        return chance;
    }

    public static int isChessWhite(int x, int y, char [][] board) {
        int chance = 0;

        for( int i = x; i < x + 8; i++ )
            for( int j = y; j < y + 8; j++ )
                if( board[i][j] != Wboard[i-x].charAt(j-y) ) chance++;
        return chance;
    }
}