import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Queue<String> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; st.hasMoreTokens(); j++)
                q.add(st.nextToken());

            int len = q.size();
            String start = br.readLine();
            int round = Integer.parseInt(br.readLine());

            while (true) {
                assert q.peek() != null;
                if (q.peek().equals(start)) break;

                String name = q.poll();
                q.add(name);
            }

            String winner = "";
            for (int k = 0; k < round; k++) {
                winner = q.poll();
                q.add(winner);
            }
            bw.write(winner + "\n");
            bw.flush();
        }
    }
}