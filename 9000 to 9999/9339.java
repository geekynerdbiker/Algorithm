import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] numbers = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++)
                numbers[i] = Integer.parseInt(st.nextToken());

            int M = Integer.parseInt(br.readLine());
            List<Record> records = new ArrayList<>();

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int number = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                int minute = Integer.parseInt(st.nextToken());
                records.add(new Record(number, time, minute));
            }

            int best = 2359, bestN = 0, award = 0;
            for (int i = 0; i < records.size(); i++) {
                Record player = records.get(i);
                boolean isReg = false;

                for (int j = 0; j < N; j++)
                    if (player.number == numbers[j]) {
                        isReg = true;
                        break;
                    }
                if (!isReg) continue;
                if (player.time >= 0) {
                    if (player.time <= 6) {
                        if (player.time == 6 && player.minute > 0) continue;
                        award++;
                        if (player.time * 100 + player.minute <= best) {
                            best = player.time * 100 + player.minute;
                            bestN = player.number;
                        }
                    }
                } else continue;
            }
            System.out.println(bestN + " " + award);
        }
    }
}

class Record {
    int number;
    int time;
    int minute;

    Record(int n, int t, int m) {
        this.number = n;
        this.time = t;
        this.minute = m;
    }
}