package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int T;
    static char[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input = br.readLine().toCharArray();
            getPassword();
        }
    }

    public static void getPassword() {
        List password = new ArrayList();
        int cursor = 0;

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case '<':
                    if (cursor > 0) cursor--;
                    break;

                case '>':
                    if (cursor < password.size()) cursor++;
                    break;

                case '-':
                    if (!password.isEmpty()) {
                        password.remove(cursor-1);
                        cursor--;
                    }
                    break;

                default:
                    password.add(cursor, input[i]);
                    cursor++;
            }
        }

        for (int i = 0; i < password.size(); i++)
            System.out.print(password.get(i));
    }
}