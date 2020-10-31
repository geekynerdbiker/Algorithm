import java.io.*;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int min = 500, max = -500;
		int[][] obs = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			obs[i][0] = Integer.parseInt(st.nextToken());
			obs[i][1] = Integer.parseInt(st.nextToken());

			if(obs[i][0] > max) max = obs[i][0];
			if(obs[i][1] > max) max = obs[i][1];
			if(obs[i][0] < min) min = obs[i][0];
			if(obs[i][1] < min) min = obs[i][1];
		}

		int[][] map = new int[max+min+2][max+2];
	}
}