import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long score = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		if( N == 0 ) {
			bw.write("1");
			bw.flush();
			return;
		}
		long [] board = new long [N];

		int rank = 1;
		int p = 1;
		
		st = new StringTokenizer(br.readLine());
		for( int i = 0; i < N; i++ ) { 
			board[i] = Long.parseLong(st.nextToken());
			if( board[i] > score ) rank++;
			if( board[i] >= score ) p++;
		}
		
		if( rank > P || p > P ) bw.write("-1");
		else bw.write(Integer.toString(rank));
		
		bw.flush();
	}
}