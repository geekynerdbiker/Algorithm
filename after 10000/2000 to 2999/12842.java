import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(br.readLine());

		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < M; i++)
			pq.add(new Pair(Integer.parseInt(br.readLine()), i + 1));

		int bread = N;
		while (bread >= S) {
			pq.poll();
			bread--;

		}
	}
}

class Pair {
	int t;
	int n;

	Pair(int t, int n) {
		this.t = t;
		this.n = n;
	}
}