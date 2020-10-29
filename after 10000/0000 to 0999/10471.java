import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] coor = new int[P + 2];
        boolean[] size = new boolean[W + 1];
        st = new StringTokenizer(br.readLine());

        coor[0] = 0;
        coor[P + 1] = W;

        for (int i = 1; i <= P; i++)
            coor[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < P + 1; i++)
            for (int j = i + 1; j < P + 2; j++)
                size[coor[j] - coor[i]] = true;

        for (int i = 1; i < W + 1; i++) {
            if (size[i]) {
                System.out.print(i);
                if (i != W) System.out.print(' ');
            }
        }
    }
}