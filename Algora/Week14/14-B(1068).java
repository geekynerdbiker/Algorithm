import java.io.*;
import java.util.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int [] tree = new int [N];
		boolean [] visited = new boolean [N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for( int i = 0; i < N; i++ )
			tree[i] = Integer.parseInt(st.nextToken());

		int remover = Integer.parseInt(br.readLine());

		removeNode(tree, visited, remover);
		
		for(int i = 0; i < N; i++) 
			System.out.print(tree[i] + " ");
	}

	public static void removeNode(int [] tree, boolean [] visited, int k) {
		tree[k] = -2;
		visited[k] = true;
		for( int i = 0; i < tree.length; i++ )
			if( !visited[i] ) {
				if( tree[i] == k ) {
					tree[i] = -2;
					visited[i] = true;
					removeNode(tree, visited, i);
				}
			}
	}
}