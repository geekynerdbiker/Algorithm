import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int count = 0;
	public static int [][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static int [][] password = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0, -1, -1 } };
	public static void main(String args[]) throws IOException {
		int T = Integer.parseInt(br.readLine());
		boolean [][] visited = new boolean[4][3];
		
		for( int t = 0; t < T; t++ ) {
			int N = Integer.parseInt(br.readLine());
			visited = new boolean[4][3];

			for( int i = 0; i < 4; i++ )
				for( int j = 0; j < 3; j++ ) 
					if( password[i][j] != -1 )
						DFS(visited, i, j, 1, N);

			count %= 1234567;

			bw.write(Integer.toString(count));
			bw.flush();

			count = 0;
		}
	}

	public static void DFS(boolean [][] visited, int x, int y, int len, int N) {
		if( len == N ) {
			count++;
			return;
		}

		for( int i = 0; i < 4; i++ ) {
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];

			if( nextX >= 0 && nextX < password.length && nextY >= 0 && nextY < password.length - 1)
				if( password[nextX][nextY] != -1 && !visited[nextX][nextY] )
					DFS(visited, nextX, nextY, len + 1, N);
		}
	}
}