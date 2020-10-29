import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int [][] magicSquare = new int [N][N];
		boolean [] visited = new boolean [N*N+1];

		for( int i = 0; i < N; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			for( int j = 0; j < N; j++ )
				magicSquare[i][j] = Integer.parseInt(st.nextToken());
		}	
		int sum = N * (N * N + 1) / 2;
		if( checkLine(magicSquare, sum) && checkDia(magicSquare, sum) && checkNumbers(magicSquare, visited) )
			bw.write("TRUE");
		else bw.write("FALSE");
		bw.flush();
	}

	public static boolean checkLine(int [][] arr, int value) {
		for( int i = 0; i < arr.length; i++ ) {
			int sumRow = 0, sumCol = 0;
			for( int j = 0; j < arr.length; j++ ) {
				sumRow += arr[j][i];
				sumCol += arr[i][j];
			}
			if( sumRow != value || sumCol != value ) return false;
		}
		return true;
	}

	public static boolean checkDia(int [][] arr, int value) {
		int sumAsc = 0, sumDesc = 0;
		for( int i = 0; i < arr.length; i++ ) {
			int k = arr.length - i - 1;
			sumAsc += arr[i][i];
			sumDesc += arr[i][k];
		}
		if( sumAsc != value || sumDesc != value) return false;

		return true;
	}

	public static boolean checkNumbers(int [][] arr, boolean [] visited) {
		for( int i = 0; i < arr.length; i++ )
			for( int j = 0; j < arr.length; j++ ) {
				if( visited[arr[i][j]] ) return false;
				visited[arr[i][j]] = true;
			}
		return true;
	}
}