import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		boolean [] line = new boolean [10000];
		
		int minStart = 0;
		int maxEnd = 0;
		while( N-- > 0 ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			minStart = Math.min(minStart, start);
			maxEnd = Math.max(maxEnd, end);
			
			for( int i = start; i < end; i++ )
				line[i] = true;
		}
		
		int length = 0;
		for( int i = minStart; i <= maxEnd; i++ )
			if( line[i] ) length++;
		
		
		bw.write(Integer.toString(length));
		bw.flush();
	}
}