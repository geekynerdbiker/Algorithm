import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] DNAs = new char[N][M];

        for (int i = 0; i < N; i++)
            DNAs[i] = br.readLine().toCharArray();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
            }
    }
}