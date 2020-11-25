import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int R = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        int N = Integer.parseInt(br.readLine());
        char[][] inputs = new char[N][R];

        int score = 0;
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine().toCharArray();
            for (int j = 0; j < R; j++) {
                if (input[j] == 'S' && inputs[i][j] == 'P')
                    score += 2;
                else if (input[j] == 'P' && inputs[i][j] == 'R')
                    score += 2;
                else if (input[j] == 'R' && inputs[i][j] == 'S')
                    score += 2;
                else if (input[j] == 'P' && inputs[i][j] == 'P')
                    score++;
                else if (input[j] == 'R' && inputs[i][j] == 'R')
                    score++;
                else if (input[j] == 'S' && inputs[i][j] == 'S')
                    score++;
            }
        }

        int maxScore = 0;
        for (int j = 0; j < R; j++) {
            int r = 0, s = 0, p = 0;
            for (int i = 0; i < N; i++) {
                if (inputs[i][j] == 'R') r++;
                else if (inputs[i][j] == 'S') s++;
                else p++;
            }
        }

        System.out.printf("%d\n%d", score, maxScore);
    }
}