import java.io.*;
import java.util.StringTokenizer;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		boolean[] numbers = new boolean[1000];
		int prev1 = 0, prev2 = 0, count = 0;

		while (count < N) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int n = Integer.parseInt(st.nextToken());

				int k1 = n;
				int k2 = prev1 * 10 + n;
				int k3 = prev2 * 100 + prev1 * 10 + n;

				numbers[k1] = true;
				numbers[k2] = true;
				numbers[k3] = true;

				prev2 = prev1;
				prev1 = n;
				count++;
			}
		}

		int min = 1000;
		for (int i = 0; i < numbers.length; i++)
			if (!numbers[i]) {
				min = i;
				break;
			}

		bw.write(Integer.toString(min));
		bw.flush();
	}
}