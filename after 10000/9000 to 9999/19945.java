import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] bits = new int[32];

        boolean isNeg = false;

        if (N < 0) isNeg = true;
        if (N == 0) {
            System.out.print(1);
            return;
        }

        for (int i = 31; N != 0; i--) {
            bits[i] = N % 2;
            N /= 2;
        }

        if (isNeg) {
            for (int i = 31; i >= 0; i--) {
                if (bits[i] == 1) bits[i] = 0;
                else bits[i] = 1;
            }

            if (bits[31] == 0) bits[31] = 1;
            else if (bits[31] == 1) {
                bits[31] = 0;
                for (int i = 30; i >= 0; i--) {
                    if (bits[i] == 0) bits[i] = 1;
                    break;
                }
            }
        }

        int result = 32;
        for (int i = 0; i < 32; i++) {
            if (bits[i] == 1) break;
            result--;
        }

        System.out.print(result);
    }
}