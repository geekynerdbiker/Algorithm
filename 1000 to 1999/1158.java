import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> ar = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++)
            ar.add(i + 1);

        int index = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (!ar.isEmpty()) {
            index = (index + K - 1) % ar.size();
            answer.add(ar.get(index));
            ar.remove(index);
        }

        bw.write("<");
        for (int i = 0; i < answer.size(); i++) {
            bw.write(answer.get(i).toString());
            if (i < N - 1)
                bw.write(", ");
        }
        bw.write(">");
        bw.flush();
    }
}
