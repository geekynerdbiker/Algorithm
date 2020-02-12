import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		char [] var = br.readLine().toCharArray();
		boolean javaFlag = false, cppFlag = false;

		for( int i = 0; i < var.length; i++ ) {
			if( var[i] < 91 && var[i] >= 65 ) javaFlag = true;
			if( var[i] == 95 ) cppFlag = true;
		}
		
		if( javaFlag && cppFlag ) {
			bw.write("Error!");
			bw.flush();
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		if( javaFlag ) {
			int startIndex = 0, endIndex = 0;
			
			for( int i = 0; i < var.length; i++ ) {
				if( var[i] < 91 && var[i] >= 65 ) {
					var[i] += 32;
					endIndex = i-1;
					
					for( int j = startIndex; j <= endIndex; j++ )
						sb.append(var[j]);
					
					sb.append('_');
					startIndex = i;
				}
			}
			for( int i = startIndex; i < var.length; i++ )
				sb.append(var[i]);
		}
		
		else if( cppFlag ) {
			int startIndex = 0, endIndex = 0;
			
			for( int i = 0; i < var.length; i++ ) {
				if( var[i] == 95 ) {
					endIndex = i;
					
					for( int j = startIndex; j < endIndex; j++ )
						sb.append(var[j]);
					
					startIndex = i+1;
					var[i+1] -= 32;
				}
			}
			for( int i = startIndex; i < var.length; i++ )
				sb.append(var[i]);
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}