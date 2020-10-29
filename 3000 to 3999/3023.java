import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        char [][] card = new char [2*R][2*C];

        for( int i = 0; i < R; i++ ) {
            char [] pattern = br.readLine().toCharArray();
            for( int j = 0; j < C; j++ ) {
                card[i][j] = pattern[j];
                card[2*R-i-1][j] = pattern[j];
                card[i][2*C-j-1] = pattern[j];
                card[2*R-i-1][2*C-j-1] = pattern[j];
            }
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        if( card[x-1][y-1] == '.' ) card[x-1][y-1] = '#';
        else if( card[x-1][y-1] == '#' ) card[x-1][y-1] = '.';

        for( int i = 0; i < 2*R; i++ ) {
            for( int j = 0; j < 2*C; j++ )
                bw.write(Character.toString(card[i][j]));
            bw.write("\n");
        }
        bw.flush();
    }
}