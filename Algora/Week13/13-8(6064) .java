import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int T = Integer.parseInt(br.readLine());

		for( int i = 0; i < T; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int gcb = GCB(m, n);
			int lcm = m * n / gcb;
			int year = -1;

			int lDiff = x - 1;
			int rDiff = y - 1;

			for (int j = 0; (m * j) < lcm; j++) { 
				int mulX = m * j;
				int cur = mulX + lDiff + 1;
				int right = (cur - 1) % n + 1;
				
				if (right == y)
					year = cur; 
			}
			bw.write(Integer.toString(year) + "\n");
			bw.flush();
		}
	}
	
	public static int GCB(int a, int b) {
		if( a > b ) {
			if( a % b != 0 )
				return GCB(b, a % b);
			else
				return b;
		}
		else {
			if( b % a != 0 )
				return GCB(a, b % a);
			else
				return a;
		}
	}
}