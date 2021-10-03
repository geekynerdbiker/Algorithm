import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		int [] golds = new int[N+1];
		int [] silvers = new int[N+1];
		int [] bronzes = new int[N+1];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			golds[num] = Integer.parseInt(st.nextToken());
			silvers[num] = Integer.parseInt(st.nextToken());
			bronzes[num] = Integer.parseInt(st.nextToken());
		}

		int place = 1;
		for(int i=0; i <= N; i++){
			if(golds[i] > golds[K]) place++;
			else if (golds[i] == golds[K]) {
				if (silvers[i] > silvers[K]) place++;
				else if (silvers[i] == silvers[K])
					if(bronzes[i] > bronzes[K]) place++;
			}
		}

		bw.write(Integer.toString(place));
		bw.flush();
	}
}