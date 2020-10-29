import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][M];
        boolean[] row = new boolean[N];
        boolean[] col = new boolean[M];
        int r = 0, c = 0;

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    col[j] = true;
                    row[i] = true;
                }
            }
        }

        for (int i = 0; i < N; i++)
            if (!row[i]) r++;

        for (int i = 0; i < M; i++)
            if (!col[i]) c++;

        System.out.println(Math.max(r, c));
    }
}