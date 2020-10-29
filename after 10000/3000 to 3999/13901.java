package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    final static int OBSTACLE = -1;
    final static int VISITED = 1;

    static int R, C, sR, sC;
    static int[] order;
    static int[][] map, dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new int[R][C];

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int bR = Integer.parseInt(st.nextToken());
            int bC = Integer.parseInt(st.nextToken());
            map[bR][bC] = OBSTACLE;
        }

        st = new StringTokenizer(br.readLine());
        sR = Integer.parseInt(st.nextToken());
        sC = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        order = new int[4];

        for (int i = 0; i < 4; i++)
            order[i] = Integer.parseInt(st.nextToken()) - 1;

        simulation();
    }

    public static void simulation() {
        int currentX = sR, currentY = sC, index = 0;
        map[currentX][currentY] = VISITED;

        while (true) {
            if (!canMove(currentX, currentY)) break;
            while (true) {
                currentX += dir[order[index]][0];
                currentY += dir[order[index]][1];

                if (currentX < 0 || currentY < 0 || currentX > R || currentY > C) break;
                if (map[currentX][currentY] == VISITED || map[currentX][currentY] == OBSTACLE) break;

                map[currentX][currentY] = VISITED;
            }
            currentX -= dir[order[index]][0];
            currentY -= dir[order[index]][1];
            index++;
            if (index == 4) index = 0;
        }
        System.out.println(currentX + " " + currentY);
    }

    public static boolean canMove(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + dir[i][0];
            int nextY = y + dir[i][1];

            if (nextX >= 0 && nextX < R && nextY >= 0 && nextY < C) {
                if (map[nextX][nextY] != OBSTACLE && map[nextX][nextY] != VISITED) return true;
            }
        }
        return false;
    }
}