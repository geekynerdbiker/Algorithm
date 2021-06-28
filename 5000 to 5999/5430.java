import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String str = br.readLine();
            str = str.replaceAll("[^0-9]", " ");
            st = new StringTokenizer(str);

            Deque<Integer> arr = new ArrayDeque<>();
            for (int i = 0; i < n; i++)
                arr.add(Integer.parseInt(st.nextToken()));

            boolean isReversed = false;

            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == 'R') isReversed = !isReversed;
                else {
                    if (arr.isEmpty()) break;
                    if (isReversed) arr.removeLast();
                    else arr.removeFirst();
                }
            }

            StringBuilder sb = new StringBuilder();
            if (arr.isEmpty()) System.out.println("error");
            else {
                int len = arr.size();
                sb.append('[');
                for (int i = 0; i < len; i++) {
                    sb.append(arr.poll());
                    if (i != len - 1) sb.append(',');
                }
                sb.append(']');
            }
            bw.write(sb.toString());
        }
        bw.flush();
    }
}