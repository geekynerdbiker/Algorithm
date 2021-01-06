import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
	}
}

class Pair {
	int t;
	int s;

	Pair(int t, int s) {
		this.t = t;
		this.s = s;
	}
}

class sort implements Comparator<Pair> {
	@Override
	public int compare(Pair o1, Pair o2) {
		if( o1.s < o2.s ) return 1;
		return 0;
	}
}
