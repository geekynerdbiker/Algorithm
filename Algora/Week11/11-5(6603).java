import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N;
	public static boolean [] visited;
	public static List<Integer> set;
	public static void main(String args[]) throws IOException {
		do {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			set = new ArrayList<Integer>();
			for( int i = 0; i < N; i++ )
				set.add(Integer.parseInt(st.nextToken()));

			visited = new boolean [set.size()];
			backtrack(0, 0);
			bw.write("\n");
			bw.flush();
		} while( N != 0 );
	}

	public static void backtrack(int start, int index) throws IOException {
		StringBuilder sb = new StringBuilder();
		int [] lottery = new int [6];

		if( index == 6 ) {
			for( int i = 0; i < N; i++ ) {
				if( visited[i] ) sb.append(set.get(i) + " ");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");

			bw.write(sb.toString());
			bw.flush();
		}

		for( int i = start; i < N; i++ ) {
			if( visited[i] ) continue;
			visited[i] = true;
			backtrack(i+1, index+1);
			visited[i] = false;
		}
	}
}
