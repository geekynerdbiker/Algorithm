import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int result = 0;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[][] image = new int[R][C];
        int[][] filter = new int[R - 2][C - 2];


        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++)
                image[i][j] = Integer.parseInt(st.nextToken());
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < R - 2; i++)
            for (int j = 0; j < C - 2; j++)
                filter[i][j] = getMiddle(image, i+1, j+1, T);

        System.out.print(result);
    }

    public static int getMiddle(int[][] image, int x, int y, int T) {
        ArrayList<Integer> filter = new ArrayList<Integer>();
        int[][] dir = {{-1, 1}, {-1, 0}, {-1, -1}, {0, 1}, {0, -1}, {1, 1}, {1, 0}, {1, -1}};

        filter.add(image[x][y]);
        for (int i = 0; i < 8; i++)
            filter.add(image[x + dir[i][0]][y + dir[i][1]]);

        Collections.sort(filter);

        if(filter.get(4) >= T) result++;
        return filter.get(4);
    }
}