import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		
		for( int i = 0; i < N; i++ ) {
			if( i % 2 == 1 ) bw.write(" ");
			for( int j = 0; j < N; j++ ) {
				bw.write("*");
				if( j != N-1 ) bw.write(" ");
			}
			if( i != N-1 ) bw.write("\n");
		}
		bw.flush();
	}
}