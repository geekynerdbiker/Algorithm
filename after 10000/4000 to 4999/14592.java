import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Score> scores = new ArrayList<Score>();

        int index = 1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            if (scores.size() == 0) {
                scores.add(new Score(S, C, L, index));
                index++;
                continue;
            }
            for (int j = 0; j < scores.size(); j++) {
                if (scores.get(j).S == S) {
                    if (scores.get(j).C == C) {
                        if (scores.get(j).L > L) scores.add(j, new Score(S, C, L, index));
                        else scores.add(new Score(S, C, L, index));
                    } else if (scores.get(j).C > C) scores.add(j, new Score(S, C, L, index));
                    else scores.add(new Score(S, C, L, index));
                } else if (scores.get(j).S < S) scores.add(j, new Score(S, C, L, index));
                else scores.add(new Score(S, C, L, index));
                index++;
                break;
            }
        }
        System.out.print(scores.get(0).index);
    }
}

class Score {
    int S;
    int C;
    int L;
    int index;

    Score(int S, int C, int L, int index) {
        this.S = S;
        this.C = C;
        this.L = L;
        this.index = index;
    }
}