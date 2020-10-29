import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] DP = new int[46];

        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 1;

        for (int i = 3; i <= N; i++)
            DP[i] = DP[i - 1] + DP[i - 2];

        System.out.println(DP[N]);
    }
}