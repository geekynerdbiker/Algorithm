import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] sum = new int[N];

        for (int i = 0; i < N; i++)
            sum[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            System.out.println(getValue(sum, i));
        }
    }

    public static int getValue(int[] sum, int index) {
        int n = 0;
        boolean op = true;

        for (int i = index; i < sum.length; i++) {
            if (op) {
                n += sum[i];
                op = false;
            } else {
                n -= sum[i];
                op = true;
            }
        }
        for (int i = 0; i < index; i++) {
            if (op) {
                n += sum[i];
                op = false;
            } else {
                n -= sum[i];
                op = true;
            }
        }
        return n / 2;
    }
}