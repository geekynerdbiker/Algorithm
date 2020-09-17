import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] DP = new int[1000001];

        DP[0] = 0; DP[1] = 1;
        for(int i=2; i<DP.length; i++)
            DP[i] = (DP[i-1] + DP[i-2]) % 1000000007;

        System.out.print(DP[N]);
    }
}