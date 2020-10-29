import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= N; i++)
            if (i % getDigitSum(i) == 0) count++;

        System.out.print(count);
    }

    public static int getDigitSum(int N) {
        int sum = 0;

        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }

        return sum;
    }
}