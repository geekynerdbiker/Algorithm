import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int [] DP = new int [1001];
		
		DP[1] = 1; DP[3] = 1; DP[4] = 1;
		
		for( int i = 5; i <= N; i++ )
			if( !(DP[i-1] == 1 && DP[i-3] == 1 && DP[i-4] == 1) )
				DP[i] = 1;
		
		if( DP[N] == 1 ) bw.write("SK");
		else bw.write("CY");
		bw.flush();
	}
}
