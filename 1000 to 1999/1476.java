//Stack Overflow

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        getDate(E, S, M, 0);
    }

    public static void getDate(int E, int S, int M, int date) {
        if (E == 0 && S == 0 && M == 0) {
            System.out.print(date);
            return;
        }
        if (E == 0) E = 15;
        if (S == 0) S = 28;
        if (M == 0) M = 19;

        getDate(E - 1, S - 1, M - 1, date + 1);
    }
}