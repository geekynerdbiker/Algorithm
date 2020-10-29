import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String input = br.readLine();
            if (input.compareTo("-1") == 0) break;

            ArrayList<Integer> list = new ArrayList();
            StringTokenizer st = new StringTokenizer(input);
            int N = Integer.parseInt(st.nextToken());

            while (N != 0) {
                list.add(N);
                N = Integer.parseInt(st.nextToken());
            }
            Collections.sort(list);

            int count = 0;
            for (int i = list.size() - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (list.get(i) % 2 == 0 && list.get(i) / 2 == list.get(j)) {
                        count++;
                        break;
                    }
                }
            }

            System.out.println(count);
        }
    }
}