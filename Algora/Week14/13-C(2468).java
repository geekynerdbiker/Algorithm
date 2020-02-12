import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int [][] dir = { {1, 0}, {0, -1}, {-1, 0}, {0, 1} };
	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int max = 0, result = 0;

		int [][] arr = new int [N][N];
		int [][] status = new int[N][N];
		boolean [][] visited = new boolean[N][N];

		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for( int j = 0; j < N; j++ ) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
			}
		}
		
		for( int depth = 1; depth <= max; depth++ ) {
			int count = 0;
			
			status = new int[N][N];
			visited = new boolean[N][N];
			copy(arr, status, depth);
			
			for( int i = 0; i < N; i++ )
				for( int j = 0; j < N; j++ )
					if( !visited[i][j] && status[i][j] != 0 ) {
						DFS(status, visited, i, j);
						count++;
					}
			result = Math.max(result, count);
		}

		bw.write(Integer.toString(result));
		bw.flush();
	}	

	public static void copy(int [][] arr, int [][] status, int depth) {
		for( int i = 0; i < arr.length; i++ )
			for( int j = 0; j < arr.length; j++ )
				if( arr[i][j] > depth ) status[i][j] = arr[i][j];
	}
	
	public static void DFS(int [][] status, boolean [][] visited, int x, int y) {
		visited[x][y] = true;
		
		for( int i = 0; i < 4; i++ ) {
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];
			
			if( nextX >= 0 && nextX < visited.length && nextY >= 0 && nextY < visited.length )
				if( !visited[nextX][nextY] && status[nextX][nextY] != 0 )
					DFS(status, visited, nextX, nextY);
		}
	}
}