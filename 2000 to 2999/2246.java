import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		int[][] candidates = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			candidates[i][0] = Integer.parseInt(st.nextToken());
			candidates[i][1] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			int candidateD = candidates[i][0];
			int candidateC = candidates[i][1];
			boolean isCandidate = true;
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				if (candidateD >= candidates[j][0])
					if (candidateC > candidates[j][1]) {
						isCandidate = false;
						break;
					}
				if (candidateC >= candidates[j][1])
					if (candidateD > candidates[j][0]) {
						isCandidate = false;
						break;
					}
			}
			if (isCandidate) count++;
		}

		System.out.print(count);
	}
}