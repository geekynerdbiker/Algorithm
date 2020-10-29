package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] data = new int[1000001];
        int N = Integer.parseInt(br.readLine());
        int max = 0, answer = -1;

        if (N == 0) return;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(st.nextToken());
            data[K]++;

            if (max < K) max = K;
        }

        for (int i = 0; i <= max; i++) {
            if (i == data[i]) answer = i;
        }

        System.out.print(answer);

    }
}