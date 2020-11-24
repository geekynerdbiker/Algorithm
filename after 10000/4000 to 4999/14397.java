import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++)
            map[i] = br.readLine().toCharArray();

        int length = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char curr = map[i][j];
                char next, prevUnder, nextUnder;

                if (j == M - 1) next = map[i][j];
                else next = map[i][j + 1];

                if (i == N - 1) {
                    prevUnder = map[i][j];
                    nextUnder = map[i][j];
                } else {
                    if (i % 2 == 0) {
                        if (j == 0) prevUnder = map[i][j];
                        else prevUnder = map[i + 1][j - 1];
                        nextUnder = map[i + 1][j];
                    } else {
                        prevUnder = map[i + 1][j];
                        if (j == M - 1) nextUnder = map[i][j];
                        else nextUnder = map[i + 1][j + 1];
                    }
                }
                if (curr != nextUnder) length++;
                if (curr != prevUnder) length++;
                if (curr != next) length++;
            }
        }
        bw.write(Integer.toString(length));
        bw.flush();
    }
}