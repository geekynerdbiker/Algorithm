import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean[][] map;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        map = new boolean[398][398];

        star(N, 0, 0);

        int k = (N - 1) * 4 + 1;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++)
                if (map[i][j]) System.out.print('*');
                else System.out.print(' ');
            System.out.println();

        }
    }

    public static void star(int n, int x, int y) {
        if (n == 1) {
            map[x][y] = true;
            return;
        }

        int len = (n - 1) * 4 + 1;

        for (int i = x; i < x + len; i++) {
            map[x][i] = true;
            map[x + len - 1][i] = true;
        }

        for (int i = y; i < y + len; i++) {
            map[i][y] = true;
            map[i][y + len - 1] = true;
        }

        star(n-1, x+2, y+2);
    }
}