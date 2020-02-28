I don knowimport java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int [] plum = new int [T];
		int [] DP = new int [1001];
		int shift = 0, index = 0, start = 0;

		for( int i = 0; i < T; i++ ) {
			plum[i] = Integer.parseInt(br.readLine());

			if( i == 0 ) {
				shift = plum[i];
				start = plum[i];
			}

			if( shift == plum[i] ) DP[index]++;
			else {
				shift = plum[i];
				index++;
				DP[index]++;
			}
		}

		if( start == 1 )
			bw.write(Integer.toString(getDP(DP, 0, W)));
		else
			bw.write(Integer.toString(Math.max(getDP(DP, 0, W-1), getDP(DP, 1, W+1))));
		bw.flush();
	}

	public static int getDP(int [] DP, int start, int end) {
		int sum = 0;
		for( int i = start; i <= end; i++ )
			sum += DP[i];
		return sum;
	}
}