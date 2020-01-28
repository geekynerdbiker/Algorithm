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

		set.sort(new pComparator());
		visited = new boolean [set.size()];

		bw.write("Start\n");
		matchNumber(0, 1);
		bw.write("End");
		
		bw.flush();
	}

	public static void matchNumber(int sum, int n) throws IOException {
		if( sum == n ) matchNumber(0, n+1);
		for( int i = 0; i < set.size(); i++ ) {
			if( visited[i] ) continue;
			for( int j = 0; j <= i; j++ )
				visited[j] = true;

			if( sum + set.get(i) <= n ) matchNumber(sum + set.get(i), n);
			else {
				bw.write(n);
				bw.flush();
				return;
			}

			for( int j = 0; j <= i; j++ )
				visited[j] = false;
		}
	}
}

class pComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if( o1 > o2 ) return 1;
		return -1;
	}
}