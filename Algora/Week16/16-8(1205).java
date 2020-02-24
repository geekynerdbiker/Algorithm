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

		List<Long> board = new ArrayList<Long>();

		st = new StringTokenizer(br.readLine());
		for( int i = 1; i < N; i++ ) {
			board.add(Long.parseLong(st.nextToken()));

			if( board.get(i-1) <= score ) {
				bw.write(Integer.toString(i));
				bw.flush();
				return;
			}
		}

		bw.write("-1");
		bw.flush();
	}
}