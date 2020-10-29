import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] DP = new int[10];

        for (int i = 0; i < 10; i++)
            DP[i] = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += DP[i];
            if (sum == 100) break;
            if (i < 9 && sum + DP[i + 1] > 100) {
                sum = (100 - sum < sum + DP[i + 1] - 100) ? sum : sum + DP[i + 1];
                break;
            }
        }
        System.out.print(sum);
        bw.close();
    }
}