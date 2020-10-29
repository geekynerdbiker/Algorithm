import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] bot = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bot[i][0] = Integer.parseInt(st.nextToken());
            bot[i][1] = Integer.parseInt(st.nextToken());
        }

        int t = 0;
        for (int i = 0; i < N; i++) {
            if (t == 0) t += bot[i][1];
            else {
                int interval = bot[i][0] + bot[i][1];
                if (t % interval == 0)
                    t += bot[i][1];
                else if (t % interval <= bot[i][1])
                    t += (bot[i][1] - t % interval);
            }
            t++;
        }

        System.out.print(t);
    }
}