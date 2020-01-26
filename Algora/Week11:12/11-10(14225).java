import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, answer;
	public static ArrayList<Integer> set;
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		set = new ArrayList<>();

		for( int i = 0; i < N; i++ )
			set.add(Integer.parseInt(st.nextToken()));

		set.sort(new pComparator());

		bw.write("");
		bw.flush();
	}

	public static void backtrack(int index) {
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