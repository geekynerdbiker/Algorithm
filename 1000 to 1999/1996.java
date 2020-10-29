import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                if (line[j] != '.')
                    map[i][j] = Integer.parseInt(String.valueOf(line[j]));
                else map[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    int mines = getMines(i, j, map);
                    if(mines > 10) System.out.print('M');
                    else System.out.print(mines);
                }
                else System.out.print('*');
            }
            System.out.println();
        }
    }

    public static int getMines(int x, int y, int[][] map) {
        int[] dir_x = {1, 1, 1, 0, 0, -1, -1, -1};
        int[] dir_y = {1, 0, -1, 1, -1, 1, 0, -1};

        int N = map.length;
        int mines = 0;

        for (int dir = 0; dir < 8; dir++) {
            int nextX = x + dir_x[dir];
            int nextY = y + dir_y[dir];

            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) continue;
            else mines += map[nextX][nextY];
        }
        return mines;
    }
}