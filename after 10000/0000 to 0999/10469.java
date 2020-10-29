import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static char[][] chess;

    public static void main(String[] args) throws IOException {
        chess = new char[8][8];

        int queen = 0;
        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                chess[i][j] = line.charAt(i);
                if(chess[i][j] == '*')
                    queen++;
            }
        }

        if(queen != 8) {
            System.out.print("invalid");
            return;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chess[i][j] == '*')
                    if (!check(i, j)) {
                        System.out.print("invalid");
                        return;
                    }
            }
        }
        System.out.print("valid");
    }

    public static boolean check(int x, int y) {
        int[][] dir = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};

        for (int i = 0; i < 8; i++) {
            int nextX = x, nextY = y;
            while(true) {
                nextX += dir[i][0];
                nextY += dir[i][1];

                if(nextX < 0 || nextY < 0 || nextX > 7 || nextY > 7) break;
                if (chess[nextX][nextY] == '*') return false;
            }
        }

        return true;
    }
}