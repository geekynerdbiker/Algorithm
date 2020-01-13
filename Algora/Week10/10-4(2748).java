import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		long [] DP = new long [N+1];

		if( N == 0 ) {
			bw.write("0");
			bw.flush();
			return;
		}
		
		DP[0] = 0; DP[1] =1;

		for( int i = 2; i < N + 1; i++ )
			DP[i] = DP[i-1] + DP[i-2];

		bw.write(Long.toString(DP[N]));
		bw.flush();
	}
}