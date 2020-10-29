import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<Integer>();

        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if( command.equals("push_front") ) {
                int k = Integer.parseInt(st.nextToken());
                dq.addFirst(k);
            }

            else if( command.equals("push_back") ) {
                int k = Integer.parseInt(st.nextToken());
                dq.addLast(k);
            }

            else if( command.equals("pop_front") ) {
                if( dq.isEmpty() ) System.out.println(-1);
                else System.out.println(dq.pollFirst());
            }

            else if( command.equals("pop_back") ) {
                if( dq.isEmpty() ) System.out.println(-1);
                else System.out.println(dq.pollLast());
            }

            else if( command.equals("size") ) System.out.println(dq.size());
            else if( command.equals("empty") ) {
                if( dq.isEmpty() ) System.out.println(1);
                else System.out.println(0);
            }

            else if( command.equals("front") ) {
                if( dq.isEmpty() ) System.out.println(-1);
                else System.out.println(dq.peekFirst());
            }

            else if( command.equals("back") ) {
                if( dq.isEmpty() ) System.out.println(-1);
                else System.out.println(dq.peekLast());
            }
        }
    }
}