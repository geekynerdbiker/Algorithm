import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Pair> probs = new ArrayList<Pair>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            probs.add(new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int score = 0;
        for (int i = probs.size() - 1; i >= 0 && K != 0; i--) {
            if (L >= probs.get(i).hard) {
                score += 140;
                K--;
                probs.remove(i);
            }
        }

        for (int i = probs.size() - 1; i >= 0 && K != 0; i--) {
            if (L >= probs.get(i).normal) {
                score += 100;
                K--;
                probs.remove(i);
            }
        }

        System.out.println(score);
    }
}

class Pair {
    int hard, normal;

    Pair(int x, int y) {
        this.normal = x;
        this.hard = y;
    }
}