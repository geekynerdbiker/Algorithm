import java.util.*;
import java.io.*;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static ArrayList<Integer> [] al;
	public static void main(String args[]) throws IOException {
		int N = Integer.parseInt(br.readLine()), L = Integer.parseInt(br.readLine());
		int answer = 0;

		al = new ArrayList[N+1];
		boolean [] visit = new boolean [N+1];

		for( int i = 0; i < N+1; i++) 
			al[i] = new ArrayList<>();

		for( int i = 0; i < L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			al[u].add(v);
			al[v].add(u);
		}

		dfs(1, visit);

		for(boolean f : visit){
			if(f == true) answer++;
		}
		bw.write(Integer.toString(answer-1));
		bw.flush();
	}

	public static void dfs(int u, boolean [] visit) {
		visit[u] = true;

		for(int v : al[u]){
			if(visit[v] == false) dfs(v, visit);
		}
	}
}