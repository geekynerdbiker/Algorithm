import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[N];
        int min = 1000, max = 0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score < min) min = score;
            if (score > max) max = score;
            scores[i] = score;
        }

        System.out.println(max - min);
    }
}