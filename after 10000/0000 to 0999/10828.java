import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Stack stack = new Stack();

        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if( command.equals("push") ) {
                int n = Integer.parseInt(st.nextToken());
                stack.push(n);
            }
            else if( command.equals("empty") ) {
                boolean status = stack.isEmpty();
                if( status == true ) System.out.println(1);
                else System.out.println(0);
            }
            else if( command.equals("pop") ) {
                if( !stack.isEmpty() ) System.out.println(stack.pop());
                else System.out.println(-1);
            }
            else if( command.equals("size") ) System.out.println(stack.size());
            else if( command.equals("top") ) {
                if( !stack.isEmpty() ) System.out.println(stack.peek());
                else System.out.println(-1);
            }
        }
    }
}