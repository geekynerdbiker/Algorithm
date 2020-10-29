package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());

        if (n1 == n2 && n2 == n3)
            System.out.println(10000 + n1 * 1000);

        else if (n1 == n2 && n1 != n3)
            System.out.println(1000 + n1 * 100);

        else if (n1 == n3 && n1 != n2)
            System.out.println(1000 + n1 * 100);

        else if (n2 == n3 && n1 != n2)
            System.out.println(1000 + n2 * 100);

        else
            System.out.println(biggest(n1, n2, n3) * 100);
    }

    static int biggest(int n1, int n2, int n3) {
        return (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
    }
}