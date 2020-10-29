import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer((br.readLine()));
        double[] DP = new double[11];

        DP[0] = Double.parseDouble(st.nextToken());
        int year = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= year; i++) {
            DP[i] = (int)(DP[i - 1] * 1.05);
            if (i >= 3) {
                DP[i] = Math.max(DP[i], (int)(DP[i - 3] * 1.2));
            }
            if (i >= 5) {
                DP[i] = Math.max(DP[i], (int)(DP[i - 5] * 1.35));
            }
        }
        System.out.print((int)DP[year]);
    }
}