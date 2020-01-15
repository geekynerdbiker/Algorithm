import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		int [][] array = new int [N+1][N+1];

		for( int i = 1; i <= N; i++ ) {
			char [] c = br.readLine().toCharArray();

			for( int j = 1; j <= N; j++ ) {
				if( c[j-1] == 'Y' ) array[i][j] = 1;
				else array[i][j] = 10000;
			}
		}

		bw.write(Integer.toString(floydWarshall(array)));
		bw.flush();
	}


	public static int floydWarshall(int [][] arr) {
		int result = 0;

		for( int i  = 1; i < arr.length; i++ )
			for( int j = 1; j < arr.length; j++ )
				for( int k = 1; k < arr.length; k++ ) {
					if( i == j || j == k || k == i ) continue;
					else if( arr[i][j] > arr[i][k] + arr[k][j] )
						arr[i][j] = arr[i][k] + arr[k][j];
				}

		for( int i = 1; i < arr.length; i++ ) {
			int sum = 0;
			for( int j = 1; j < arr[i].length; j++ ) {
				if( i == j ) continue;
				else if( arr[i][j] <= 2 ) sum++;
			}

			result = Math.max(result, sum);
		}
		
		return result;
	}
}