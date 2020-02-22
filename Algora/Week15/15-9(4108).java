import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		while( true ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());

			if( R == 0 && C == 0 ) break;
			char [][] map = new char [R][C];

			for( int i = 0; i < R; i++ ) {
				map[i] = br.readLine().toCharArray();
				for( int j = 0; j < C; j++ ) 
					if( map[i][j] == '.' ) map[i][j] = '0';
			}

			for( int i = 0; i < R; i++ )
				for( int j = 0; j < C; j++ )
					countMine(map, i, j);

			for( int i = 0; i < R; i++ ) {
				for( int j = 0; j < C; j++ )
					bw.write(Character.toString(map[i][j]));
				bw.write("\n");
				bw.flush();
			}
		}
	}

	public static void countMine(char [][] map, int x, int y) {
		int [][] dir = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1 , 1 } };

		if( map[x][y] != '*' ) {
			for( int i = 0; i < 8; i++ ) {
				int nextX = x + dir[i][0];
				int nextY = y + dir[i][1];

				if( !(nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length) ) continue;
				if( map[nextX][nextY] == '*' ) map[x][y]++;
			}
		}
	}
}