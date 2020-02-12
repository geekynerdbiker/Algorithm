import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int [] tree = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for( int i = 0; i < N; i++ )
			tree[i] = Integer.parseInt(st.nextToken());
		
		int remover = Integer.parseInt(br.readLine());
		
	}
}