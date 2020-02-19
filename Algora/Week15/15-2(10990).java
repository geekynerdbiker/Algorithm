import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());

		for( int i = 0; i < N; i++) {
			for( int j = N - 1; j > i; j-- )
				bw.write(" ");
			bw.write("*");

			if( i > 0 ) {
				for( int j = 0; j < 2*i-1; j++ )
					bw.write(" ");
			bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}