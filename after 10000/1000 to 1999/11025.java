import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] DP = new int[N + 1];
        DP[0] = 0;

        for (int i = 1; i <= N; i++)
            DP[i] = ((DP[i - 1] + K - 1) % i) + 1;

        System.out.print(DP[N]);
    }
}
