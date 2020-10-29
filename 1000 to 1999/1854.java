package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int now, cost;

        Node(int now, int cost) {
            this.now = now;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    static PriorityQueue<Integer> [] dq;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        dq = new PriorityQueue[N + 1];

        for (int i = 0; i < N + 1; i++) dq[i] = new PriorityQueue<>(K);
        dq[1].add(0);
        map = new int[N + 1][N + 1];

        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[a][b] = c;
        }

        dijkstra(N, K);

        for (int i = 1; i <= N; ++i) {
            if (dq[i].size() == K) System.out.println(dq[i].peek() * -1);
            else System.out.println(-1);
        }
    }

    static void dijkstra(int N, int K) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node tmp = pq.poll();

            for (int i = 1; i <= N; ++i) {
                if (map[tmp.now][i] != 0) {
                    if (dq[i].size() < K) {
                        dq[i].add((tmp.cost + map[tmp.now][i]) * -1);
                        pq.add(new Node(i, tmp.cost + map[tmp.now][i]));
                    } else if ((dq[i].peek() * -1) > tmp.cost + map[tmp.now][i]) {
                        dq[i].poll();
                        dq[i].add((tmp.cost + map[tmp.now][i]) * -1);
                        pq.add(new Node(i, tmp.cost + map[tmp.now][i]));
                    }
                }
            }
        }
    }
}
