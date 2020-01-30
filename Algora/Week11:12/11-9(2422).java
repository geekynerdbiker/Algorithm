import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, P, count = 0;
	public static boolean [] visited;
	public static int [] arr = new int [3];
	public static ArrayList<Pair> permutation;
	public static void main(String args[]) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());

		visited = new boolean [N+1];
		permutation = new ArrayList<>();

		for( int i = 0; i < P; i++ ) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			permutation.add(new Pair(x, y));
		}

		backtrack(0);

		bw.write(Integer.toString(count));
		bw.flush();
	}

	public static void backtrack(int index) {
		if( index == 3 ) {
			if( isGoodCombi(arr) ) count++;
			return;
		}

		if( N < 3 ) {
			if( isGoodCombi(arr) ) count++;
			return;
		}

		for( int i = index+1; i <= N; i++ ) {
			if( visited[i] ) continue;
			for( int j = index+1; j <= i; j++ )
				visited[j] = true;
			arr[index] = i;
			backtrack(index+1);
			for( int j = index+1; j <= i; j++ )
				visited[j] = false;
		}
	}

	public static boolean isGoodCombi(int [] arr) {
		for( int i = 0; i < permutation.size(); i++ ) {
			for( int j = 0; j < 3; j++ )
				if( permutation.get(i).x == arr[j] )
					for( int k = j+1; k < 3; k++ )
						if( permutation.get(i).y == arr[k] ) return false;
		}
		return true;
	}
}

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
