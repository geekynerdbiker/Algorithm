import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			int k = 0, count = 0;
			int[] set = new int[n];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				k += Integer.parseInt(st.nextToken());
				set[i] = k;
				if (k % d == 0) count++;

				for (int j = 0; j < i; j++)
					if (Math.abs(set[j] - set[i]) % d == 0)
						count++;
			}

			System.out.println(count);
		}
	}
}