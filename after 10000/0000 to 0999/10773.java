import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0) s.push(input);
            else s.pop();
        }


        bw.write(Integer.toString(sum));
        bw.flush();
    }
}