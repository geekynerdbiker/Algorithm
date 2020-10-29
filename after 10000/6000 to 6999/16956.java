import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];

        for (int i = 0; i < R; i++)
            map[i] = br.readLine().toCharArray();

        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                if (map[i][j] == 'S')
                    if (!isSafe(map, R, C, i, j)) {
                        System.out.println(0);
                        return;
                    }
        System.out.println(1);
        print(map, R, C);
    }

    static boolean isSafe(char[][] map, int R, int C, int x, int y) {
        int[] dirX = {0, 0, 1, -1};
        int[] dirY = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int X = x + dirX[i], Y = y + dirY[i];
            if (X >= 0 && Y >= 0 && X < R && Y < C) {
                if (map[X][Y] == 'W') return false;
                else if (map[X][Y] != 'S') map[X][Y] = 'D';
            }
        }
        return true;
    }

    static void print(char[][] map, int R, int C) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }
}