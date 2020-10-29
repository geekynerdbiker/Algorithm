import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int [] DP = new int [N+1];
		
		bw.write(Integer.toString(bottomUp(DP, N)));
		bw.flush();
	}
	
	public static int bottomUp(int [] arr, int k) {
		if( k == 0 ) return 0;
		
		arr[0] = 1;
		arr[1] = 3;
		
		for( int i = 2; i < k; i++ ) {
			arr[i] = arr[i-1] + arr[i-2] * 2;
			arr[i] %= 10007;
		}
		
		return arr[k-1];
		}
}