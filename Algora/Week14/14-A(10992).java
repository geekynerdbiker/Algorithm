import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());

		for( int i = 0; i < N; i++ ) {
			if( i == N - 1 )
				for( int j = 0; j < 2*N-1; j++ )
					bw.write("*");
					
			else {
				for( int j = N-1; j > i; j-- )
					bw.write(" ");
				bw.write("*");
				
				if( i != 0) {
					for( int k = 0; k < 2*i-1; k++ )
						bw.write(" ");
					bw.write("*");
				}
			}
			bw.write("\n");
			bw.flush();
		}
	}
}