import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N;
	public static boolean [] visited;
	public static List<Integer> set = new ArrayList<Integer>();
	public static void main(String args[]) throws IOException {
		do {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			
			for( int i = 0; i < N; i++ )
				set.add(Integer.parseInt(st.nextToken()));
			
			visited = new boolean [set.size()];
					
				
		} while( N != 0 );
	}
	
	public static void backtrack() {
		for( int i = 0; i < N; i++ )
			for( int j = 0; j < 6; j++ ) {
				
			}
	}
}
