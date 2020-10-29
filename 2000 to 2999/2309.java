import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int [] height = new int [9];

    public static void main(String args[]) throws IOException {
        int sum = 0, count = 0;
        for( int i  = 0; i < 9; i++ ) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        end:
        for( int i = 0; i < 9; i++ ) {
            if( sum - height[i] <= 100 ) continue;
            for( int j = i + 1; j < 9; j++ ) {
                if( sum - height[i] - height[j] != 100 ) continue;
                height[i] = -1;
                height[j] = -1;
                break end;
            }
        }

        Arrays.sort(height);

        for( int i = 0; i < 9; i++ )
            if( height[i] == -1 ) continue;
            else bw.write(height[i] + "\n");

        bw.flush();
    }

}
