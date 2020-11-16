import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] colors = new int[C];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++)
            colors[i] = Integer.parseInt(st.nextToken());

        int[][] table = new int[W][H];

        int k = 1, count = 0, index = 0;
        for (int i = 0; i < W; i++) {
            if( i % 2 == 0) {
                for (int j = 0; j < H; j++) {
                    table[i][j] = k;
                    count++;
                    if (count == colors[index]) {
                        index++;
                        count = 0;
                        k++;
                    }
                }
            }
            else {
                for (int j = H-1; j >= 0; j--) {
                    table[i][j] = k;
                    count++;
                    if (count == colors[index]) {
                        index++;
                        count = 0;
                        k++;
                    }
                }
            }
        }

        for (int i=0; i <W; i++) {
            System.out.println();
            for (int j = 0; j < H; j++)
                System.out.print(table[i][j]);
        }
    }
}