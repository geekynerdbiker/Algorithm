import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int arr [] = new int[8+1];
	public static boolean visited [] = new boolean [8+1];

	public static void main(String args[]) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

		recursion(0, N, M);		
	}

	public static void recursion(int index, int N, int M) throws IOException {
		StringBuilder sb = new StringBuilder();

		if( index == M ) {
			for( int i = 0; i < M; i++ ) {
				sb.append(arr[i]);
				if( i != M ) sb.append(" ");
			}

			bw.write(sb.toString() + "\n");
			bw.flush();
			return;
		}

		for( int i = 1; i <= N; i++ ) {
			arr[index] = i;
			recursion(index + 1, N, M);
		}
	}
}