import java.io.*;
import java.util.StringTokenizer;

public class Main {
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] time = new int[3];

		time[0] = Integer.parseInt(st.nextToken());
		time[1] = Integer.parseInt(st.nextToken());
		time[2] = Integer.parseInt(st.nextToken());
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			int query = Integer.parseInt(st.nextToken());

			if (query == 1) addTime(time, Integer.parseInt(st.nextToken()));
			else if (query == 2) subTime(time, Integer.parseInt(st.nextToken()));
			else {
				bw.write(time[0] + " " + time[1] + " " + time[2]);
				if(i != tc-1) bw.write("\n");
			}
		}
		bw.flush();
	}

	public static void addTime(int[] time, int s) {
		time[0] += s / 3600;
		s %= 3600;
		time[1] += s / 60;
		s %= 60;
		time[2] += s;
	}

	public static void subTime(int[] time, int s) {
		time[0] -= s / 3600;
		s %= 3600;
		time[1] -= s / 60;
		s %= 60;
		time[2] -= s;

		if (time[1] < 0) {
			time[0]--;
			time[1] += 60;
		}

		if (time[2] < 0) {
			time[1]--;
			time[2] += 60;
		}
	}
}