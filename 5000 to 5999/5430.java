import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int [] dq;

        for( int i = 0; i < T; i++ ) {
            st = new StringTokenizer(br.readLine());
            char [] command = st.nextToken().toCharArray();
            int n = Integer.parseInt(br.readLine());
            dq = new int [n];

            String array = br.readLine();
            array = array.replaceAll("[\\[\\]]", "").replaceAll(",", " ");

            st = new StringTokenizer(array);
            for( int j = 0; st.hasMoreTokens(); j++ )
                dq[j] = Integer.parseInt(st.nextToken());

            func(dq, command);
        }
    }

    public static void func(int [] dequeue, char [] command) throws IOException {
        int front = 0, back = dequeue.length - 1, order = 1;

        for( int i = 0; i < command.length; i++ ) {
            if( command[i] == 'D' ) {
                if( !isRegular(dequeue, front, back) ) {
                    System.out.println("error");
                    return;
                }
                if( order == 1 ) front++;
                else back--;
            }

            else order *= -1;
        }
        print(dequeue, front, back, order);
    }

    public static void print(int [] array, int front, int back, int order) throws IOException {

        StringBuilder sb = new StringBuilder();

        sb.append('[');

        if( order == 1 )
            for( int i = front; i <= back; i++ ) {
                if( !isRegular(array, front, back) ) break;
                sb.append(array[i]);
                if( i == back ) break;
                sb.append(',');
            }

        else
            for( int i = back; i >= front; i-- ) {
                if( !isRegular(array, front, back) ) break;
                sb.append(array[i]);
                if(i == front) break;
                sb.append(',');
            }

        sb.append(']');
        System.out.println(sb);
    }

    public static boolean isRegular(int [] array, int front, int back) {
        if( front >= array.length ) return false;
        if( back <= 0 ) return false;
        if( front >= back ) return false;
        return true;
    }
}