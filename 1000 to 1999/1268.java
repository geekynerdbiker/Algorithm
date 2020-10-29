package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer>[] students = new HashSet[N];
        int[][] data = new int[N][5];

        if (N == 0) return;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int K = Integer.parseInt(st.nextToken());
                data[i][j] = K;
            }
        }

        for (int i = 0; i < N; i++)
            students[i] = new HashSet<>();

        for (int j = 0; j < 5; j++)
            for (int i = 0; i < N; i++)
                for (int k = 0; k < N; k++)
                    if (data[i][j] == data[k][j])
                        students[i].add(k);

        int max = 0, index = 0;
        for (int i = 0; i < N; i++) {
            if (max < students[i].size()) {
                max = students[i].size();
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}