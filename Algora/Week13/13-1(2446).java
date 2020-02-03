import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		int N = Integer.parseInt(br.readLine());
		
		for( int i = 2*N-1; i > 0; i -= 2 ) {
			for( int j = 0; j < 2*N-1-i; j += 2 )
				bw.write(" ");
			for( int k = 0; k < i; k++ )
					bw.write("*");
				bw.write("\n");
			}
		
		for( int i = 3; i <= 2*N-1; i += 2 ) {
			for( int j = 0; j < 2*N-1-i; j += 2 )
				bw.write(" ");
			for( int k = 0; k < i; k++ )
				bw.write("*");
			bw.write("\n");
		}
		
		bw.flush();
	}
}