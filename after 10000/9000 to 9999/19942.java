import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rp = Integer.parseInt(st.nextToken());
        int rf = Integer.parseInt(st.nextToken());
        int rs = Integer.parseInt(st.nextToken());
        int rv = Integer.parseInt(st.nextToken());

        int [][] table = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                table[i][j] = Integer.parseInt(st.nextToken());
        }
    }
}