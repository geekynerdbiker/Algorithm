import java.util.*;
import java.io.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static ArrayList<Integer> [] ar;
    public static void main(String args[]) throws IOException {
        int N = kb.nextInt(), L = kb.nextInt(), answer = 0;
        
        ar = new ArrayList[N+1];
        boolean [] visit = new boolean [N+1];
        
        for( int i = 0; i < N+1; i++)
            ar[i] = new ArrayList<>();
        
        for( int i = 0; i < L; i++) {
            int u = kb.nextInt(), v = kb.nextInt();
            ar[u].add(v);
            ar[v].add(u);
        }
        
        dfs(1, visit);
        
        for(boolean f : visit){
            if(f == true) answer++;
        }
        System.out.println(answer-1);
    }
    
    public static void dfs(int u, boolean [] visit) {
        visit[u] = true;
        
        for(int v : ar[u]){
            if(visit[v] == false) dfs(v, visit);
        }
    }
}
