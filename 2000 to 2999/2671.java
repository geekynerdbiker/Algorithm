import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, M;
	public static int [][] set;
	public static boolean [][] visited;

	public static void main(String args[]) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();

		set = new int [N+1][N+1];
		visited = new boolean [N+1][N+1];

		for( int i = 0; i < M; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

			set[a][b] = 1;
			set[b][a] = -1;	
		}

		int result = 0, cnt1, cnt2;

		for( int i = 1; i <= N; i++ ) {
			for( int j = 1; j <= N; j++ ) {
				if( set[i][j] != 0 ) {
					visited[i][j] = true;
					dfs(j, i, set[i][j]);
					
					for( int x = 1; x <= N; x++ ) 
						for( int y = 1; y <= N; y++ )
							visited[x][y] = false;	
				}
			}
		}
		
		for( int i = 1; i <= N; i++ ) {
			cnt1 = 0;
			cnt2 = 0;
			
			for( int j = 1; j <= N; j++ ) {
				if( set[i][j] == -1) cnt1++;
				else if( set[i][j] == 1) cnt2++;
			}
			
			if( cnt1 > N/2 ) result++;
			if( cnt2 > N/2 ) result++;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
	}


	public static void dfs(int y, int origin, int k) {
		for( int i = 1; i <= N; i++ )
			if( set[y][i] == k && !visited[y][i]) {
				visited[y][i] = true;
				set[origin][i] = k;
				dfs(i, origin, k);
			}
	}
}