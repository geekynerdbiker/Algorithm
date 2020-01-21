import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static int N;
	public static boolean flag = true;
	public static List<Integer> set = new ArrayList<Integer>();
	public static void main(String args[]) throws IOException {
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for( int i = 0; i < N; i++ )
			set.add(Integer.parseInt(st.nextToken()));

		Loop:
			for( int i = N-1; i > 0; i-- ) {
				if( set.get(i-1) > set.get(i) ) {
					for( int j = N - 1; j >= i; j-- ) {
						if( set.get(j) < set.get(i-1) ) {
							Collections.swap(set, i-1, j);
							int k = N - 1;
							while( i < k ) {
								Collections.swap(set, i, k);
								i++;
								k--;
							}
							flag = false;
							break Loop;
						}
					}
				}
			}
		
		if( flag ) bw.write("-1\n");
		else
			for( int i = 0; i < N; i++ )
				bw.write(set.get(i) + " ");
		bw.flush();
	}
}