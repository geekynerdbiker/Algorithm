import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException{
        int N = Integer.parseInt(br.readLine());

        int [][] set = new int [N][2];

        for( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

            set[i][0] = x;
            set[i][1] = y;
        }

        Arrays.parallelSort(set, new Comparator<int []>() {
            @Override
            public int compare(int[] x, int[] y) {
                if( x[0] == y[0] )
                    return Integer.compare(x[1], y[1]);
                return Integer.compare(x[0], y[0]);
            }
        });

        for( int i = 0; i < N; i++ )
            bw.write(set[i][0] + " " + set[i][1] + "\n");
        bw.flush();
    }
}