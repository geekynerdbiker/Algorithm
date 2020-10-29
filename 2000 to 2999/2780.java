import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int KJM = Integer.parseInt(st.nextToken()), LHS = Integer.parseInt(st.nextToken());
		int round = 0;
		
		while ( KJM != LHS ) {
			KJM = nextNum(KJM);
			LHS = nextNum(LHS);
			round++;
		}
		
		bw.write(Integer.toString(round));
		bw.flush();
	}
	
	public static int nextNum(int k) {
		if( k % 2 == 0 ) return k / 2;
		else return k / 2 + 1;
	}
}

/*
import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static final int MOD = 1234567;
	public static int [][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	public static int [][] password = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0, -1, -1 } };
	public static int [][] pwdCase = { { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 1, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 1, 0, 0 },
			{ 0, 0, 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0 },
			{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 } };

	public static void main(String args[]) throws IOException {
		int T = Integer.parseInt(br.readLine());
		int [][] DP = new int [10][1001];
		
		for( int t = 0; t < T; t++ ) {
			int N = Integer.parseInt(br.readLine());

			for( int i = 0; i < 10; i++ ) {
				Arrays.fill(DP[i], -1);
				DP[i][1] = 1;
			}
			
			long sum = 0;
			for( int i = 0; i < 10; i++ ) {
				sum += fn(DP, i, N);
				sum %= MOD;
			}
				
			bw.write(Long.toString(sum));
			bw.flush();

		}
	}

	public static int fn(int [][] DP, int digit, int len) {
		int result = DP[digit][len];
		if( result != -1 ) return result;
		
		result = 0;
		for( int i = 0; i < 10; i++ )
			if( pwdCase[digit][i] == 1 )
				result += fn(DP, i, len-1) % MOD;
		
		return result;
			
	}
}
*/