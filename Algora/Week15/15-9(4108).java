import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int size;
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());

		int [][] picture = new int [R][C];
		boolean [][] visited = new boolean [R][C];

		for( int i = 0; i < R; i++ ) {
			st = new StringTokenizer(br.readLine());
			for( int j = 0; j < C; j++ ) 
				picture[i][j] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		for( int i = 0; i < R; i++ )
			for( int j = 0; j < C; j++ )
				if( !visited[i][j] && picture[i][j] != 0 ) {
					size = 0;
					countMine(picture, visited, i, j);
					count++;
				}

		bw.write(Integer.toString(count) + "\n");
		bw.write(Integer.toString(size));
		bw.flush();
	}

	public static void countMine(int [][] arr, boolean [][] visited, int x, int y) {
		int [][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		visited[x][y] = true;

		for( int i = 0; i < 4; i++ ) {
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];


			if( nextX >= 0 && nextX < arr.length && nextY >= 0 && nextY < arr[0].length )
				if( !visited[nextX][nextY] && arr[nextX][nextY] != 0 ) {
					size++;
					countMine(arr, visited, nextX, nextY);
					visited[x][y] = false;
				}	
		}
	}
}