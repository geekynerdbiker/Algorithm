import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int back = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            
            String command = st.nextToken();

            
            if( command.equals("push")) {
                int k = Integer.parseInt(st.nextToken());
                queue.add(k);
                back = k;
            }
            
            else if( command.equals("pop")) {
                if( queue.isEmpty() ) System.out.println(-1);
                else System.out.println(queue.poll());
            }

            else if( command.equals("empty")) {
                if( queue.isEmpty() ) System.out.println(1);
                else System.out.println(0);
            }
            
            else if( command.equals("front")) {
                if( queue.isEmpty() ) System.out.println(-1);
                else System.out.println(queue.peek());
            }
            else if( command.equals("back")) {
                if( queue.isEmpty() ) System.out.println(-1);
                else System.out.println(back);
            }
            
            else if( command.equals("size")) System.out.println(queue.size());
        }
     }
}
