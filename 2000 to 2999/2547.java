package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            long candy = 0;

            for (int j = 0; j < N; j++) {
                candy += Long.parseLong(br.readLine()) % N;
            }

            if(N == 0){
                System.out.println("YES");
                return;
            }

            if(candy % N == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}