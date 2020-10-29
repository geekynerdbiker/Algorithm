import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Deque<Integer> dq = new ArrayDeque<Integer>();
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        int [] command = new int [N+1];
        int [] set = new int [N+1];

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i = 1; i <= N; i++ ) {
            command[i] = Integer.parseInt(st.nextToken());
            set[i] = i;
        }

        for( int i = 1; i <= N; i++ )
            useSkill(command[N-i+1], set[i]);

        for( int i = 0; i < N; i++ )
            if( i != N - 1 ) sb.append(dq.pollFirst().toString() + " ");
            else sb.append(dq.pollFirst().toString());
        bw.write(sb.toString());
        bw.flush();
    }

    public static void useSkill(int n, int k) {
        if( n == 1 ) dq.addFirst(k);
        else if( n == 2 ) {
            int x = dq.pollFirst();
            dq.addFirst(k);
            dq.addFirst(x);
        }
        else if( n == 3 ) dq.addLast(k);
    }
}