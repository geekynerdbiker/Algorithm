import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, answer;
	public static boolean [] visited;
	public static ArrayList<Integer> set;
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		set = new ArrayList<>();

		for( int i = 0; i < N; i++ )
			set.add(Integer.parseInt(st.nextToken()));

		visited = new boolean [set.size()];

		backtrack(0, 1);
	}

	public static void backtrack(int sum, int n) throws IOException {
		if( sum == n ) {
			System.out.println(n);
			backtrack(0, n+1);
			return;
		}
		else if( sum > n ) {
			//System.out.println("["+n+", "+sum+"]");
			return;
		}

		else {
			for( int i = 0; i < set.size(); i++ ) {
				if( visited[i] ) continue;
				visited[i] = true;
				backtrack(sum + set.get(i), n);
				visited[i] = false;	
			}
		}
		//System.exit(0);
	}
}