import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[][] attend = new int[N][T];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < T; j++)
                attend[i][j] = Integer.parseInt(st.nextToken());
        }

        int[] probScore = new int[T];
        int[] attendScore = new int[N];
        int[] solvedScore = new int[N];

        for (int i = 0; i < T; i++) {
            int score = 0;
            for (int j = 0; j < N; j++)
                if (attend[j][i] == 0) score++;
            probScore[i] = score;
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < T; j++)
                if (attend[i][j] == 1) {
                    attendScore[i] += probScore[j];
                    solvedScore[i]++;
                }

        int pRank = 1;
        int pScore = attendScore[P-1];
        int pSolved = solvedScore[P-1];

        for (int i = 0; i < N; i++){
            if(attendScore[i] > pScore) pRank++;
            if(attendScore[i] == pScore && solvedScore[i] > pSolved) pRank++;
            if(attendScore[i] == pScore && solvedScore[i] == pSolved && i+1 < P)
                pRank++;
        }

        System.out.print(pScore + " " + pRank);
    }
}