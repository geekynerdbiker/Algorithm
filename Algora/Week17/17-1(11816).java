import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		char [] number = br.readLine().toCharArray();
		
		if( number[0] == 0 ) {
			if( number[1] != 'x' ) {
				
			}
			
			else {
				
			}
		}
		bw.write("");
		bw.flush();
	}

	public static int getSum(int [] DP, int start, int end) {
		int sum = 0;
		for( int i = start; i <= end; i++ )
			sum += DP[i];
		return sum;
	}
}