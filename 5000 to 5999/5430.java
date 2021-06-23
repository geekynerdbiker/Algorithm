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

        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String str = br.readLine();
            str = str.replaceAll("[^0-9]", " ");
            st = new StringTokenizer(str);

            Deque<Integer> arr = new ArrayDeque<>();
            for (int j = 0; j < n; j++)
                arr.add(Integer.parseInt(st.nextToken()));

            boolean isReversed = false;

            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == 'R') isReversed = !isReversed;
                else {
                    if (arr.isEmpty()) break;
                    if (isReversed) arr.removeLast();
                    else arr.removeFirst();
                }
            }

            if (arr.isEmpty()) System.out.println("error");
            else {
                int len = arr.size();
                System.out.print('[');
                for (int j = 0; j < len; j++) {
                    System.out.print(arr.poll());
                    if (j != len - 1) System.out.print(',');
                }
                System.out.println(']');
            }
        }

        bw.flush();
    }
}