import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		long [] DP = new long [N+1];
		
		DP[0] = 1; DP[1] = 1;
		
		for( int i = 2; i < N + 1; i++ )
			DP[i] = DP[i-1] + DP[i-2];
		
		long length = DP[N-1] * 2 + DP[N] * 2;
		
		bw.write(Long.toString(length));
		bw.flush();
	}
}
