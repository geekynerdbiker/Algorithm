import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] numerators = new int[N];
        int[] denominators = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int den = Integer.parseInt(st.nextToken());

            int gcd = getGCD(num, den);
            numerators[i] = num / gcd;
            denominators[i] = den / gcd;
        }

        int denResult = 1, numResult = 1, sum = 0;
        for (int i = 0; i < N; i++) {
            denResult = getLCM(denResult, denominators[i]);
            sum += numerators[i] * denResult / denominators[i];
        }
        int result = denResult / getGCD(sum, denResult);
        System.out.print("1 " + result);

    }

    public static int getGCD(int n, int m) {
        int r = 0;
        int tmp1 = n, tmp2 = m;
        if (n < m) {
            n = tmp2;
            m = tmp1;
        }

        do {
            r = n % m;
            n = m;
            m = r;
        } while (r > 0);

        return n;
    }

    public static int getLCM(int n, int m) {
        int r = 0;
        int tmp1 = n, tmp2 = m;
        if (n < m) {
            n = tmp2;
            m = tmp1;
        }

        do {
            r = n % m;
            n = m;
            m = r;
        } while (r > 0);

        return tmp1 * tmp2 / n;
    }
}