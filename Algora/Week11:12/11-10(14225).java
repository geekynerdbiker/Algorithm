import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N, answer;
	public static ArrayList<Integer> permutation;
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		permutation = new ArrayList<>();

		for( int i = 0; i < N; i++ )
			permutation.add(Integer.parseInt(st.nextToken());

		backtrack(0);

		bw.write(Integer.toString(answer));
		bw.flush();
	}

	public static void backtrack(int index) {
	}

}