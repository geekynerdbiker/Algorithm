import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		int [][] array = new int [N+1][N+1];
		int [] c = new int[N+1];
		int [][] path = new int[N+1][N+1];

		for( int i = 1; i <= N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for( int j = 1; j <= N; j++ )
				array[i][j] = Integer.parseInt(st.nextToken());
		}

		for( int i = 1; i <= N; i++ ) {
			dfs(array, c, i);

			for( int j = 1; j <= N; j++ )
				path[i][j] = c[j];
			Arrays.fill(c, 0);
		}

		for( int i = 1; i <= N; i++ ) {
			for( int j = 1; j <= N; j++ )
				sb.append(path[i][j] + " ");
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}


	public static void dfs(int [][] arr, int [] arr2, int k) {
		int n = arr.length - 1;

		for( int i = 0; i <= n; i++ )
			if( arr[k][i] == 1 && arr2[i] == 0) {
				arr2[i] = 1;
				dfs(arr, arr2, i);
			}
	}
}