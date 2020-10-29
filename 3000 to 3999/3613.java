import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		String s = br.readLine();
		char [] var = s.toCharArray();
		boolean javaFlag = false, cppFlag = false;

		for( int i = 0; i < var.length; i++ ) {
			if( var[i] < 91 && var[i] >= 65 ) javaFlag = true;
			if( var[i] == 95 ) cppFlag = true;
		}


		if( !isValid(s, javaFlag, cppFlag) ) {
			bw.write("Error!\n");
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

					if( endIndex != -1 )
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

		else 
			for( int i = 0; i < var.length; i++ )
				sb.append(var[i]);

		bw.write(sb.toString());
		bw.flush();
	}

	public static boolean isValid(String s, boolean flag1, boolean flag2) {
		String p = "^[0-9a-zA-Z_]*$";
		char [] c = s.toCharArray();
		
		if( !Pattern.matches(p, s) ) return false;
		if( c[0] == '_' || c[c.length-1] == '_' ) return false;
		for( int i = 0; i < c.length-1; i++ )
			if( c[i] == '_' && c[i+1] == '_') return false;
		
		if( c[0] >= 65 && c[0] < 91 ) return false;
		if( flag1 && flag2 ) return false;
		return true;

	}
}