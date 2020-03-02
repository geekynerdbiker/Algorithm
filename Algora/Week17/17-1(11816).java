import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		char [] input = br.readLine().toCharArray();
		int number = 0;
		
		StringBuilder sb = new StringBuilder();
		if( input[0] == 0 ) {
			if( input[1] != 'x' ) {
				for( int i = 1; i < input.length; i++ )
					sb.append(input[i]);
				number = 0 + Integer.parseInt(sb.toString());
				
			}
			else {
				for( int i = 2; i < input.length; i++ )
					sb.append(input[i]);
				number = 0x + Integer.parseInt(sb.toString());
			}
		}
		
		
		bw.write("");
		bw.flush();
	}
}