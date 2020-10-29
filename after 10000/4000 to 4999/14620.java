import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int sum, min = 3000;
    public static int[][] price;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        price = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                price[i][j] = Integer.parseInt(st.nextToken());
        }
        for (int x = 1; x < N - 1; x++)
            for (int y = 1; y < N - 1; y++) {
                sum = 0;
                DFS(x, y, 0, N);
            }

        System.out.print(min);
    }

    static void DFS(int x, int y, int seed, int N) {
        int[] dirX = {0, 0, 1, -1};
        int[] dirY = {1, -1, 0, 0};

        boolean plantable = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dirX[i];
            int nextY = y + dirY[i];
            if (!isValid(x, y, N) || !isValid(nextX, nextY, N)) {
                plantable = false;
                break;
            }
        }

        if (plantable)
            for (int dir = 0; dir < 4; dir++) {
                visited[x][y] = true;
                int nextX = x + dirX[dir];
                int nextY = y + dirY[dir];
                visited[nextX][nextY] = true;
            }
        else return;

        for (int nextX = 1; nextX < N - 1; nextX++)
            for (int nextY = 1; nextY < N - 1; nextY++) {
                if (seed == 2) {
                    int sum = calc();
                    if (min >= sum) min = sum;
                    break;
                }
                DFS(nextX, nextY, seed + 1, N);
            }

        if (plantable)
            for (int dir = 0; dir < 4; dir++) {
                visited[x][y] = false;
                int nextX = x + dirX[dir];
                int nextY = y + dirY[dir];
                visited[nextX][nextY] = false;
            }
    }


    static boolean isValid(int x, int y, int N) {
        if (x < 0 || y < 0 || x >= N || y >= N) return false;
        if (visited[x][y] == true) return false;
        return true;
    }

    static int calc() {
        int sum = 0;
        for (int i = 0; i < price.length; i++)
            for (int j = 0; j < price.length; j++)
                if (visited[i][j]) sum += price[i][j];

        return sum;
    }
}