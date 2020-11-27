import java.io.*;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] rank = new int[N][N];
        for (int i = 0; i < K; i++) {
            int[] input = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                input[j] = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    rank[input[j]][input[k]]++;
        }

        int answer = 0;
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++)
                if(rank[j][k] == K)
                    answer++;
        }
        bw.write(Integer.toString(answer));
        bw.flush();
    }
}