import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            func(0, 1, 1, 1, N, "1");
            System.out.println();
        }
    }

    public static void func(int sum, int op, int next, int prev, int N, String s) {
        if (prev == N) {
            sum += (next * op);
            if (sum == 0)
                System.out.println(s);
            return;
        }

        func(sum, op, next * 10 + prev + 1, prev + 1, N, s + ' ' + (prev + 1));
        func(sum + op * next, 1, prev + 1, prev + 1, N, s + '+' + (prev + 1));
        func(sum + op * next, -1, prev + 1, prev + 1, N, s + '-' + (prev + 1));
    }
}