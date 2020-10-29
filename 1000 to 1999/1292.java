import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
        int [] arr = new int [1001];

        for( int i = 1, index = 0; index <= end; i++ )
            for( int j = 1; j <= i && index <= end; j++ )
                arr[index++] = i;

        int sum = 0;
        for( int i = start - 1; i <= end - 1; i++ )
            sum += arr[i];

        bw.write(Integer.toString(sum));
        bw.flush();
    }
}