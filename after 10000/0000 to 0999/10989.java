import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [10001];

        for( int i = 0; i < N; i++ )
            arr[Integer.parseInt(br.readLine())]++;

        for( int i = 0; i < arr.length; i++ )
            if( arr[i] > 0 )
                for( int j = 0; j < arr[i]; j++ )
                    bw.write(Integer.toString(i) + "\n");

        bw.flush();
    }
}