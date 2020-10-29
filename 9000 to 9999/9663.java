import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int N, result = 0;
	public static int set [] = new int[15];
	public static boolean visited [] = new boolean [15];
	
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());

		for( int i = 0; i < N; i++ ) {
			set[0] = i;
			backtrack(i, 0);
		}
			
		bw.write(Integer.toString(result));
		bw.flush();
	}
	
	public static void backtrack(int x, int y) {
		for( int i = 0; i < y; i++ )
			if( set[i] == x || Math.abs(x - set[i]) == y - i ) return;
			
		if( y == N - 1 ) {
			result++;
			return;
		}
		
		for( int i = 0; i < N; i++ ) {
			set[y+1] = i;
			backtrack(i, y+1);
		}
	}
}