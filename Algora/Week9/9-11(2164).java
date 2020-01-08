import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for( int i = 0; i < N; i++ )
            queue.add(i);

        while( queue.size() > 1 ) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek() + 1);
            
            
     }
}
