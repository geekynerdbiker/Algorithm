import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int paid = -1, paid_count = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0, count = 0;

            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(st.nextToken());
                count++;

                if (sum >= K && paid_count > count) {
                    paid = i + 1;
                    paid_count = count;
                    break;
                }
            }
        }

        System.out.print(paid + " " + paid_count);
    }
}