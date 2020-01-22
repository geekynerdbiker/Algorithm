import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static HashSet<String> numbers;
	public static int [][] matrix = new int [5][5];
	public static boolean [][] visited = new boolean [5][5];
	public static int [][] dir = { {1, 0}, {0, -1}, {-1, 0}, {0, 1} };
	
	public static void main(String args[]) throws IOException {
		numbers = new HashSet<String>();
		for( int i = 0; i < 5; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for( int j = 0; j < 5; j++ )
				matrix[i][j] = Integer.parseInt(st.nextToken());
		}
		
		String s = new String();
		for( int i = 0; i < 5; i++ )
			for( int j = 0; j < 5; j++)
				backtrack(i, j, 0, s);
		
		bw.write(Integer.toString(numbers.size()));
		bw.flush();
	}

	public static void backtrack(int x, int y, int count, String number) throws IOException {
		if( count == 6 ) {
			for( int i = 0; i < 5; i++ )
				for( int j = 0; j < 5; j++ )
					numbers.add(number);
			return;
		}

		for( int i = 0; i < 4; i++ ) {
			int nextX = x + dir[i][0];
			int nextY = y + dir[i][1];

			if( !isValid(nextX, nextY) ) continue;
			else backtrack(nextX, nextY, count+1, number + matrix[x][y]);
		}
	}

	public static boolean isValid(int x, int y) {
		if( x >= 0 && x < 5 && y >= 0 && y < 5 ) return true;
		return false;
	}
}
