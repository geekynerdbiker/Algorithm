import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		String [] s = br.readLine().split(" ");

		char [][] var = new char[s.length][];
		for( int i = 0; i < s.length; i++ )
			var[i] = s[i].toCharArray();

		StringBuilder type = new StringBuilder();
		int ref = 0, dem = 0, ptr = 0;
		
		for( int i = 0; i < var[0].length; i++ ) {
			if( var[0][i] == '&' ) ref++;
			else if( var[0][i] == '[' ) {
				if( var[0][i+1] == ']' ) dem++;
			}
			
			else if( var[0][i] == '*' )	ptr++;
			else type.append(var[i].toString());
		}
		
		for( int i = 0; i < ref; i++ ) type.append("&");
		for( int i = 0; i < dem; i++ ) type.append("[]");
		for( int i = 0; i < ptr; i++ ) type.append("*");
		type.append(" ");

		for( int i = 1; i < s.length; i++ ) {
			int ref2 = 0, dem2 = 0, ptr2 = 0;
			StringBuilder sb = new StringBuilder();

			for( int j = 0; j < var[i].length; j++ ) {
				if( var[0][i] == '&' ) ref2++;
				else if( var[0][i] == '[' ) {
					if( var[0][i+1] == ']' ) dem2++;
				}

				else if( var[0][i] == '*' )	ptr2++;
				sb.append(var[i][j]);
			}
			
			for( int j = 0; j < ref; j++ ) type.append("&");
			for( int j = 0; j < dem; j++ ) type.append("[]");
			for( int j = 0; j < ptr; j++ ) type.append("*");
			type.append(" ");

		}
	}
}
