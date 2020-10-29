import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Deque<Integer> dq = new ArrayDeque<Integer>();
    public static void main(String[] args) throws IOException{
        char [] arr = br.readLine().toCharArray();

        Arrays.parallelSort(arr);

        StringBuilder sb = new StringBuilder();

        for( int i = arr.length - 1; i >= 0; i-- )
            sb.append(arr[i]);

        bw.write(sb.toString());
        bw.flush();
    }
}