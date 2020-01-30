import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, answer;
	public static boolean [] visited;
	public static int [] set;
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		set = new int [20+1];

		for( int i = 0; i < N; i++ )
			set[i] = Integer.parseInt(st.nextToken());

		visited = new boolean [2000000+1];

		backtrack(0, 0);
		
		for( int i = 0; i < 2000000+1; i++ )
			if( !visited[i] ) {
				bw.write(Integer.toString(i));
				bw.flush();
				break;
			}
	}

	public static void backtrack(int n, int sum) throws IOException {
		if( n == N ) {
			visited[sum] = true;
			return;
		}	
		
		backtrack(n+1, sum+set[n]);
		backtrack(n+1, sum);
	}
}